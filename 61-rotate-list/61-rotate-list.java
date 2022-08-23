/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head==null)
        {
            return null;
        }
        
        int cnt=0;
        
        ListNode temp=head;
        
        while(temp!=null)
        {
            cnt++;
            temp=temp.next;
            
        }
        
        temp=head;//reset temp
        ListNode t=head;//head node
        int ti=0;
        int K=k%cnt;//net effective rotation
        if(K==0) //no rotation
        {
            return head;
        }
        
        
        
        
         while(true)
        {
             ti++;
             if(ti==cnt-K)
             {
                 break;
             }
            temp=temp.next;
            
        }
        
        ListNode n=temp.next;//starting of breakpoint
        temp.next=null;//end of list
        head=n;//reset head
        while(n.next!=null)
        {
            n=n.next;
        }
        n.next=t;
        
        return head;
        
    }
}