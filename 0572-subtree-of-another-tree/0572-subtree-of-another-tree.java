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
    
    public boolean isSame(TreeNode root,TreeNode subRoot){
        if(root==subRoot)return true;
        if(root==null && subRoot!=null ||subRoot==null && root!=null)return false;
        if(root.val!=subRoot.val)return false;
        
        return (isSame(root.left,subRoot.left) && isSame(root.right,subRoot.right));
        
        
    }
    
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
    
        if(root==subRoot)return true;
        if(subRoot==null && root==null)return false;
        if(root==null)return false;
        boolean res=isSame(root,subRoot);
        if(res)return true;
         return(isSubtree(root.left,subRoot) ||isSubtree(root.right,subRoot));
        
    }
}