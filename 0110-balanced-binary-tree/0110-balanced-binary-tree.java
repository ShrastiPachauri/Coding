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
    
    public int heightDiff(TreeNode root){
        if(root==null)return 0;
        int hleft=heightDiff(root.left);
        if(hleft==Integer.MIN_VALUE)return Integer.MIN_VALUE;
            int hright=heightDiff(root.right);
         if(hright==Integer.MIN_VALUE)return Integer.MIN_VALUE;
        
        if((int)Math.abs(hleft-hright)>1)return Integer.MIN_VALUE;
        
        return 1+(int)Math.max(hleft,hright);
        
    }
    
    public boolean isBalanced(TreeNode root) {
        
        if(heightDiff(root)==Integer.MIN_VALUE)return false;
        else return true;
        
    }
}