/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        
    Deque<Node> dq=new ArrayDeque<Node>();
        
    if(root==null)
    {
        return root;
    }
    else
    {
        dq.addLast(root);
    }
        
        
      while(!dq.isEmpty())
      {
          int s=dq.size();
          
          
          for(int i=1;i<=s;i++)
          {
              Node t=dq.poll();
              if(i==s)
              {
                  t.next=null;
              }
              else
              {
                  t.next=dq.peekFirst();
              }
              if(t.left!=null)
              {
                  dq.addLast(t.left);
              }
              if(t.right!=null)
              {
                  dq.addLast(t.right);
              }
              
          }
          
          
          
          
          
          
          
      }
        
        
        return root;
        
        
        
        
        
    }
}