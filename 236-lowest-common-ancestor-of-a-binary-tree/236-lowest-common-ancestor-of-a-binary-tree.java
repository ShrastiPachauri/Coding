/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode v1, TreeNode v2) {
        if(root==null)return null;
TreeNode leftnode=null,rightnode=null;
if(root.val==v1.val || root.val==v2.val)return root;

 leftnode=lowestCommonAncestor(root.left,v1, v2);
rightnode=lowestCommonAncestor(root.right,v1, v2);

if(leftnode!=null && rightnode!=null)return root;
if(leftnode==null)return rightnode;
return leftnode;



    
}
}