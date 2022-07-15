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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        Deque<TreeNode> dq=new ArrayDeque<TreeNode>();
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
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
            List<Integer> l=new ArrayList<Integer>();
            for(int i=0;i<s;i++)
            {
                TreeNode t=dq.poll();
                l.add(t.val);
                if(t.left!=null)
                {
                    dq.add(t.left);
                }
                
                 if(t.right!=null)
                {
                    dq.add(t.right);
                }
                
                
            }
            
            ans.add(l);
        }
        
        return ans;
        
        
    }
}