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
    
    public boolean checkPathSum(TreeNode root,int target,int sum)
    {
        sum+=root.val;
        if(root.left==null && root.right==null && sum!=target)return false; //found leaf
        if(root.left==null && root.right==null && sum==target)return true;
        boolean l=false,r=false;
        
        if(root.left!=null)
        {l=checkPathSum(root.left,target,sum);
         if(l==true)return true;
        }
        
         if(root.right!=null)
         {r=checkPathSum(root.right,target,sum);
          if(r==true)return true;
         }
        return (l||r);
        
    }
    
    
    
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        if(root==null)return false;
        
        return checkPathSum(root,targetSum,0);
        
        
    }
}