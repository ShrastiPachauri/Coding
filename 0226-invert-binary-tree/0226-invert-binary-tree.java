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
    
    
    public TreeNode invert(TreeNode root){
        
        if(root==null || root.left==null && root.right==null)return root;
        invert(root.left);
        invert(root.right);
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        
        
        return root;
    }
    
    
    public TreeNode invertTree(TreeNode root) {
    return invert(root);
     
    }
}