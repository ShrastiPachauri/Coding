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
 class Pair{
TreeNode node;
int index;
Pair(TreeNode n,int index)
{
this.node=n;
this.index=index;
}

}
class Solution {
   

public int widthOfBinaryTree(TreeNode root) {
        if(root==null)return 0;

Deque<Pair> dq=new ArrayDeque<Pair>();

dq.addLast(new Pair(root,0));
int width=0;

while(!dq.isEmpty())
{
int size=dq.size();
int  reference=dq.peek().index;
    
for(int i=0;i<size;i++)
{
Pair current=dq.poll();

if(current.node.left!=null){dq.addLast(new Pair(current.node.left,2*current.index+1));}

if(current.node.right!=null)
dq.addLast(new Pair(current.node.right,2*current.index+2));
            

int currentIndex=current.index-reference;//for 0 based indexing of current level
if(i==size-1 && width<(currentIndex+1))
{width=currentIndex+1;}
                                                                          
}
}
  return width;           
           }
           }

           