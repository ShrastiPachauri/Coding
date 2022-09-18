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
    int sum=-2000;
    
public int maxPathSumu(TreeNode root)
{
    if(root==null)return 0;
    
   

int  sumwithleft=(int)Math.max(0,maxPathSumu(root.left));
int  sumwithright=(int)Math.max(0,maxPathSumu(root.right));

if((sumwithleft+sumwithright+root.val)>sum)
{
sum=sumwithleft+sumwithright+root.val;
}

return root.val+(int)Math.max(sumwithleft,sumwithright);

}

    public int maxPathSum(TreeNode root) {
        
         maxPathSumu(root);
        return sum;
      
    
}
}