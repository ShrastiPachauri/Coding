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
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> ans=new ArrayList<Integer>();
        
        Deque<TreeNode> dq=new ArrayDeque<TreeNode>();
        
        
    if(root!=null)
       {
           dq.add(root);
       }
        else
        {
            
            return ans;
        }
        
        while(!dq.isEmpty())
        {
            int s=dq.size();
          
            for(int i=0;i<s;i++)
            {
                TreeNode t=dq.poll();
                if(i==0)
                {
                ans.add(t.val);
                }
                if(t.right!=null)
                {
                    dq.addLast(t.right);
                }
                if(t.left!=null)
                {
                    dq.addLast(t.left);
                }
                
            }
           
        }
        return ans;
        
        
        
        
        
    }
}