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
        
        
        
        if(root!=null)
        {
            dq.addLast(root);
        }
        else
        {
            return root;
        }
        
        while(!dq.isEmpty())
        {
            int size=dq.size();
            
            for(int i=1;i<=size;i++)
            {
                Node temp=dq.poll();
                if(i==size)
                {
                    temp.next=null;
                }
                else
                {
                    temp.next=dq.peek();
                }
                
                if(temp.left!=null)
                {
                    dq.addLast(temp.left);
                }
                if(temp.right!=null)
                {
                    dq.addLast(temp.right);
                }
                
                
            }
            
        }
        
        return root;
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}