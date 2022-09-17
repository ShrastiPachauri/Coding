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
    
public int  height(TreeNode root)
{
if(root==null)return 0;                                                                                                                                                      
int l=0,r=0;
if(root.left!=null) l=1+height(root.left);
if(root.right!=null)r=1+height(root.right);
return (int)Math.max(l,r);
}
   
public int diameterOfBinaryTree(TreeNode root) {
        if(root==null || root.left==null && root.right==null)return 0;
int rootdia=2;
if(root.left==null)rootdia--;
if(root.right==null)rootdia--;
rootdia+=height(root.left)+height(root.right);
int l=diameterOfBinaryTree(root.left);
int r=diameterOfBinaryTree(root.right);
return (int)Math.max(rootdia,(int)Math.max(l,r));
    }
}