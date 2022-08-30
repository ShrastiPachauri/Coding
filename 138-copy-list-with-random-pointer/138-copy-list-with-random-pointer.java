/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        
       //copy Node 
        HashMap<Node,Node> hm=new HashMap<Node,Node>();//to create copy of given nodes
        
       Node temp=head;
        
        while(temp!=null)
        {
            hm.put(temp,new Node(temp.val));//a node having same data as original node 
            temp=temp.next;
            
        }
        
        //to crete links among dummy nodes
        
        temp=head;//reset
        
        while(temp!=null)
        {
            hm.get(temp).next=hm.get(temp.next);
            hm.get(temp).random=hm.get(temp.random);
            temp=temp.next;
            
        }
        return hm.get(head);
        
        
        
    }
}