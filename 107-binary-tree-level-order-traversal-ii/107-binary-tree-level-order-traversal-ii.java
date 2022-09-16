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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
       
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        
        Deque<TreeNode> dq=new ArrayDeque<TreeNode>();
        
        if(root==null)
        {
            return ans;
        }
        else
        {
            dq.addLast(root);
            
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
                    dq.addLast(t.left);
                }
                if(t.right!=null)
                {
                    dq.addLast(t.right);
                }
                
            }
            ans.add(l);
            
            
        }
       for(int i=0;i<ans.size()/2;i++)
        {
            List<Integer> l=ans.get(i);
           ans.set(i,ans.get(ans.size()-1-i));
           ans.set(ans.size()-i-1,l);
        }
        
        return ans;
    }
}