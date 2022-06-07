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
    
List<Integer> s=new ArrayList<Integer>();
    
    public boolean isSymmetric(TreeNode root) {
       
        if(root==null||root.left==null && root.right==null)
        {
            return true;
        }
        if(root.left==null && root.right!=null || root.right==null && root.left!=null )
        {
            return false;
        }
    return helper(root.left ,root.right);
    
    }
    
    public boolean helper(TreeNode l,TreeNode r)
    {
        if(l==null || r==null)
        {
            return l==r;
        }
        if(l.val!=r.val)
        {
            return false;
        }
        return helper(l.left,r.right) && helper(l.right,r.left);
        
        
    }
}