/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        ArrayList<List<Integer>> ans=new ArrayList<List<Integer>>();

if(root==null)return ans;


Deque<TreeNode> dq=new ArrayDeque<TreeNode>();
dq.addLast(root);
while(!dq.isEmpty())
{
int size=dq.size();
List <Integer> l=new ArrayList<Integer>();
    
for(int i=0;i<size;i++){
TreeNode currentNode=dq.poll();
l.add(currentNode.val);
if(currentNode.left!=null)dq.addLast(currentNode.left);
if(currentNode.right!=null)dq.addLast(currentNode.right);
}
ans.add(l);

}
for(int i=1;i<ans.size();i+=2)
{
List<Integer> l=ans.get(i);

for(int j=0;j<l.size()/2;j++)
{
int temp=l.get(l.size()-1-j);
l.set(l.size()-1-j,l.get(j));
l.set(j,temp);


}
}

return ans;

    }
}