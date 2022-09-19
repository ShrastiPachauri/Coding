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
    
    
public TreeNode constructTree(int[]inorder,int[]postorder,int instart,int inend,int poststart,int postend,HashMap<Integer,Integer> hs)
{
if(instart>inend||poststart>postend)return null;
TreeNode root=new TreeNode(postorder[postend]);
int rootIndex=hs.get(root.val);
int numleft=rootIndex-instart;

root.left=constructTree(inorder,postorder,instart,rootIndex-1,poststart,poststart+numleft-1,hs);

root.right=constructTree(inorder,postorder,rootIndex+1,inend,poststart+numleft,postend-1,hs);
return root;



}

    
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();

for(int i=0;i<inorder.length;i++)
{
hs.put(inorder[i],i);
}


return	constructTree(inorder,postorder,0,inorder.length-1,0,postorder.length-1,hs);


    }
}