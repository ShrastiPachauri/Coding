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
    
    
    public int isBalancedTree(TreeNode root)
    {
        if(root==null)return 0;
        
        int lh=0,rh=0;
        if(root.left!=null)
        {
            lh=isBalancedTree(root.left);
        }
        if(root.right!=null)
        {
            rh=isBalancedTree(root.right);
        }
        if(lh==Integer.MAX_VALUE || rh==Integer.MAX_VALUE)return Integer.MAX_VALUE;
        if(((int)Math.abs(lh-rh))>1)return Integer.MAX_VALUE;
        
        
        return (int)Math.max(lh,rh)+1;
        
        
        
    }
    public boolean isBalanced(TreeNode root) {
        
        int ans=isBalancedTree(root);
        if(ans==Integer.MAX_VALUE)return false;
        return true;
        
    }
}