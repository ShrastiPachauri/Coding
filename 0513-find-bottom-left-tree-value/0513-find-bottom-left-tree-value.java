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
    int mdepth=0;
        int max=0;
        
    public void findLeft(TreeNode root, int depth){
        if(root==null)return;
        if(depth>mdepth){
            mdepth=depth;
            max=root.val;
        }
        findLeft(root.left,depth+1);
        findLeft(root.right,depth+1);
        
    }
    
    public int findBottomLeftValue(TreeNode root) {
        max=root.val;
      findLeft(root,0);
        return max;
    }
}