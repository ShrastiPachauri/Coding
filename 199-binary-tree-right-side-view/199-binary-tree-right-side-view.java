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
        
        ArrayList<Integer> answer=new ArrayList<Integer>();//answer list
        if(root==null)return  answer;
        
        Deque<TreeNode> nodes=new ArrayDeque<TreeNode>();
        
        nodes.addLast(root);
        
        while(!nodes.isEmpty())
        {
            
            int s=nodes.size();
            
            for(int i=0;i<s;i++)
            {
                
                TreeNode currentNode=nodes.poll();
                if(i==s-1)answer.add(currentNode.val);
                if(currentNode.left!=null)nodes.addLast(currentNode.left);
                if(currentNode.right!=null)nodes.addLast(currentNode.right);
                
                
                
                
            }
            
            
            
            
            
        }
        return answer;
        
        
        
        
        
    }
}