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
    List<Integer> l=new ArrayList<Integer>();
    public void f(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        
        f(root.left);
        
        f(root.right);
        
        l.add(root.val);
        
        
        
        
        
    }
    
    
    public List<Integer> postorderTraversal(TreeNode root) {
        
        f(root);
        
        return l;
        
        
    }
}