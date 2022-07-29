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
    List<Integer> ans=new ArrayList<Integer>();
    
    
    public void f(TreeNode root)
    {
        
        
        if(root.left!=null)
        {f(root.left);}
        
       ans.add(root.val);
        
        if(root.right!=null)
        {f(root.right);}
    }
    
    
    
    
    
    
    
    public List<Integer> inorderTraversal(TreeNode root) {
        
       if(root==null)
       {
           return ans;
       }
        f(root);
        return ans;
        
    }
}