//level oredr (by me)
```
List<Integer> ans=new ArrayList<Integer>();
Queue<TreeNode> q=new ArrayDeque<TreeNode>();
public List<Integer> inorderTraversal(TreeNode root) {
if(root==null)
{
return ans ;
}
else
{
if(q.size()==0)
{q.add(root);
ans.add(root.val);
}
}
while(q.size()!=0)
{
TreeNode t=q.remove();
if(t.right!=null)
{
ans.add(t.right.val);
q.add(t.right);
}
if(t.left!=null)
{
ans.add(t.left.val);
q.add(t.left);
}
}
return ans;
}
}
```
​