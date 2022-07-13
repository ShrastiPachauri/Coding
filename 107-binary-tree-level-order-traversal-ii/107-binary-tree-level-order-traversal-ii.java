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
        
        Stack<List<Integer>> stack=new Stack<List<Integer>>();
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
            stack.push(l);
            
            
        }
        while(stack.size()!=0)
        {
            
            List<Integer> x=stack.pop();
            ans.add(x);
            
            
            
            
            
        }
        
        return ans;
        
        
        
        
        
        
    }
}