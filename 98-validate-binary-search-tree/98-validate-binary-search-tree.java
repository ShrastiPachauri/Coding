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
    
    
    public boolean checkBST(TreeNode root, long atleast,long atmax)
    {
        if(root==null)return true;//empty tree bst
        if(atleast>atmax)return false;//range invalid
        if(root.val>=atleast && root.val<=atmax){
            long x=root.val;
            boolean l=checkBST(root.left,atleast,x-1);
            boolean r=checkBST(root.right,x+1,atmax);
            return l&&r;
            
        }
         return false;   
      
        
        
    }
    
    public boolean isValidBST(TreeNode root) {
        
      
        
        return checkBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
        
        
    }
}