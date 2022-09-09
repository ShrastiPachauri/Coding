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
    
    
    public TreeNode flattenList(TreeNode root)
    {
        if(root==null)return root;
        
        TreeNode l=flattenList(root.left);
        TreeNode r=flattenList(root.right);
        
        if(l!=null)
        {root.right=l;
        root.left=null;
        TreeNode temp=l;
        while( temp!=null && temp.right!=null)temp=temp.right;
        if(temp!=r)temp.right=r;
        }
        return root;
        
        
    }
    
    
    
    
    
    
    
    public void flatten(TreeNode root) {
        
        //pre order root left right
        
       flattenList(root);
        
    }
}