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
    
    
    public boolean checkSameTree(TreeNode root,TreeNode subRoot)
    {
        if(root==null && subRoot==null)return true;
        if((root==null && subRoot!=null) || (root!=null && subRoot==null))return false;
        
        if(root.val!=subRoot.val)return false;
        return (checkSameTree(root.left,subRoot.left) && checkSameTree(root.right,subRoot.right));
        
    }
    
    
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        
        if(root==null && subRoot==null)return true;
        
        if((root==null && subRoot!=null)||(root!=null && subRoot==null))return false;
        
        Deque<TreeNode> dq=new ArrayDeque<TreeNode>();
        dq.addLast(root); //add root to deque
        
        while(!dq.isEmpty())
        {
            int s=dq.size();
            
            for(int i=0;i<s;i++)
            {
                
                TreeNode curr=dq.poll();
                
                if(curr.left!=null)
                {dq.addLast(curr.left);}
                
                if(curr.right!=null)
                {dq.addLast(curr.right);}
                
                if(checkSameTree(curr,subRoot))return true;
                
                
            }
            
            
        }
        
        return false;
        
        
        
        
        
    }
}