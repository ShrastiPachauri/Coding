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
public TreeNode buildTreeNodes(int[]inorder,int instart,int inend,int[]preorder,int prestart,int prend,HashMap<Integer,Integer>hs)
{

if(prestart>prend||instart>inend)return null; /**end is small aisa bolo ya start is big..same baat**/
    
TreeNode root=new TreeNode(preorder[prestart]);
int rootindex=hs.get(root.val); //rootindex in inorder array
int numleft=rootindex-instart;
root.left=buildTreeNodes(inorder,instart,rootindex-1,preorder,prestart+1,prestart+numleft,hs);
root.right=buildTreeNodes(inorder,rootindex+1,inend,preorder,prestart+numleft+1,prend,hs);
return root;
}
 
    
public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
for(int i=0;i<inorder.length;i++)
{
hs.put(inorder[i],i);
}
return buildTreeNodes(inorder,0,inorder.length-1,preorder,0,preorder.length-1,hs);
    }
}