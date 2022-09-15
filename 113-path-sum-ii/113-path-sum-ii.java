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
    
    public List<List<Integer>>getPath(TreeNode root,int target,int sum,List<Integer> currentList,ArrayList<List<Integer>> answer)
    {
        if(root==null)return answer;
        
        sum+=root.val; //added root's value
        currentList.add(root.val);
        if(sum==target && root.left==null && root.right==null)
        {
            List<Integer> temp=new ArrayList<Integer>(currentList);
            answer.add(temp);
        }
        getPath(root.left,target,sum,currentList,answer);
        
        getPath(root.right,target,sum,currentList,answer);
        
        sum-=root.val;
        currentList.remove(currentList.size()-1);
        return answer;
        
        
    }
    
    
    
    
    
    
    
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
        List<List<Integer>> answer=getPath(root,targetSum,0,new ArrayList<Integer>(),new ArrayList<List<Integer>>());
        
        return answer;
        
        
        
        
        
        
        
        
    }
}