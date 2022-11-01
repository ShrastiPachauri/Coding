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
    

    
    public int findBottomLeftValue(TreeNode root) {
        if(root==null)return -1;
        
        Deque<TreeNode> dq=new ArrayDeque<TreeNode>();
        dq.addLast(root);
        ArrayList<Integer> arr=new ArrayList<Integer>();
    while(!dq.isEmpty()){
        
        int s=dq.size();
        arr.clear();
        for(int i=0;i<s;i++){
            TreeNode node=dq.poll();
            arr.add(node.val);
            if(node.left!=null)dq.addLast(node.left);
            if(node.right!=null)dq.addLast(node.right);
            
        }
        
    }
        
        return arr.get(0);
    }
}