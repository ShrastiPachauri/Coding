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
   
   
    public int find(TreeNode root,int[]ans,int k)
    {
        if(root==null||ans[0]==k)return 0;
         
        find(root.left,ans,k);
        if(ans[0]<k)
        {ans[1]=root.val;
        ans[0]++;
        }
        find(root.right,ans,k);
        
  return 0;
    }
    
    public int kthSmallest(TreeNode root, int k) {
        int[]ans=new int[2];
        ans[0]=0;
        ans[1]=-1;
         find(root,ans,k);
        return ans[1];
        
        
    }
}