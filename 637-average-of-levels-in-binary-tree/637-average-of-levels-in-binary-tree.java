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
    public List<Double> averageOfLevels(TreeNode root) {
        
        List<Double> ans=new ArrayList<Double>();
          Deque<TreeNode> dq=new ArrayDeque<TreeNode>();
        
        
        if(root!=null)
        {
           
            dq.push(root);
            
        }
        
       
        while(dq.size()>0)
        {
            
            double sum=0;
            int s=dq.size();
            //System.out.println("dq size "+s);
            for(int i=1;i<=s;i++)
            {
                TreeNode front=dq.poll();
                sum+=front.val;
               //System.out.println("current sum is  "+sum);
                if(front.left!=null)
                {
                    dq.addLast(front.left);
                }
                
                if(front.right!=null)
                {
                    dq.addLast(front.right);
                }
                //System.out.println("current front "+dq.peek().val);
                 
            }
            System.out.println("sum "+sum+" s is "+s);
           
            ans.add(sum/s);
            
            
           
        }
        
        return ans;
        
        
        
        
    }
}