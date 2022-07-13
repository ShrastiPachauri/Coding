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
    public int minDepth(TreeNode root) {
        
        int ans=0;
        
        Deque<TreeNode> dq=new ArrayDeque<TreeNode>();
        if(root!=null)
        {
         dq.addLast(root);
        }
        else
        {
            return ans;
        }
        int level=1;
        while(!dq.isEmpty())
        {
            
            int s=dq.size();
            
            for(int i=1;i<=s;i++)
            {
                TreeNode t=dq.poll();
                
                if(t.left==null && t.right==null)
                {
                    return level;
                }
                
                if(t.left!=null)
                {
                    dq.addLast(t.left);
                }
                if(t.right!=null)
                {
                    dq.addLast(t.right);
                }
                
            }
            level++;
            
            
            
            
        }
        
        return level;
        
        
        
        
        
        
        
        
        
        
        
    }
}