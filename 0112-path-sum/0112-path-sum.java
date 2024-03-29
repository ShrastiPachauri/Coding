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
    
    public boolean check(TreeNode root,int targetSum){
       
        if(root==null )return false;
         if(targetSum-root.val==0 && root.left==null && root.right==null)return true;
        
       
return (check(root.left,targetSum-root.val)||check(root.right,targetSum-root.val));
        
        
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
          if(root==null)return false;
        return check(root,targetSum);
        
        
    }
}