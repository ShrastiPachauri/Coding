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
public TreeNode subtree(int[]preorder,int start,int end)
{
if(start>end)return null;/**Be careful**/
TreeNode root=new TreeNode(preorder[start]);
   
if(start==end)return root;
int rightIndex=-1;//to find start of right tree
for(int i=start;i<=end;i++)
{
if(preorder[i]>preorder[start])
{
rightIndex=i;
break;
}
}
if(rightIndex==-1)
{
root.right=null;
rightIndex=end+1;
}
else
{
root.right=subtree(preorder,rightIndex,end);
}
root.left=subtree(preorder,start+1,rightIndex-1);
//System.out.println("returning root is "+root.val);
return root;

}

    
    
    
    public TreeNode bstFromPreorder(int[] preorder) {
        
        TreeNode root= subtree(preorder,0,preorder.length-1);
        return root;

        
    }
}