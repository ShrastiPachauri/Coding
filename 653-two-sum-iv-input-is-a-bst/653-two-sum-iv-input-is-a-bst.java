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
    
    public boolean checkSum(TreeNode root,int target,HashSet<Integer> hs)
    {
        if(root==null)return false;
        if(hs.contains(target-root.val))return true;
        hs.add(root.val);
        return (checkSum(root.left,target,hs)||checkSum(root.right,target,hs));
        
        
        
    }
    
    
    
    public boolean findTarget(TreeNode root, int k) {
        
        if(root==null)return false;
        HashSet<Integer>hs=new HashSet<Integer>();
        return checkSum(root,k,hs);
        
        
        
        
    }
}