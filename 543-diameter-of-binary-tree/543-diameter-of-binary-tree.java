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
    public int diameterOfBinaryTree(TreeNode root) {
        
       if(root==null)
       {
           return 0;
       }
        
        int extremes=height(root.left)+height(root.right);
        int dl=diameterOfBinaryTree(root.left);
        int dr=diameterOfBinaryTree(root.right);
        return (int)Math.max(extremes,Math.max(dl,dr));
        
    }
    
    public int height(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        
        int l=height(root.left)+1;
        int r=height(root.right)+1;
        
        
        return (int)Math.max(l,r);
        
    }
}