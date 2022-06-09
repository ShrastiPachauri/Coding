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
    
    Queue<TreeNode> q=new ArrayDeque<TreeNode>();
         
     
    public List<Integer> inorderTraversal(TreeNode root) {
        
        if(root==null)
        {
            return ans ;
        }
        
        
        ans=inorderTraversal(root.left);
        ans.add(root.val);
        ans=inorderTraversal(root.right);
        
        return ans;
            
           
        
    }
}