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
  
    int calculate(TreeNode root,int[]sum)
    {
        if(root==null)
        {
            return 0;
        }
        
        
        int x=(int)Math.max(0,calculate(root.left,sum));
        int y=(int)Math.max(0,calculate(root.right,sum));
       
        sum[0]=(int)Math.max(sum[0],x+y+root.val);//taking root as curving point x and y are path sum for left and right path
        
        return root.val+(int)Math.max(x,y);
        
        
    }
    
    public int maxPathSum(TreeNode root) {
        
        int[] sum=new int[1];
        sum[0]=Integer.MIN_VALUE;//val is value of node
        int res=calculate(root,sum);
        return (int)Math.max(sum[0],res);
    }
}