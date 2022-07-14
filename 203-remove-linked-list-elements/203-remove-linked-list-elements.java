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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null)
        {
            return head;
        }
        
        ListNode prev=null;
        ListNode curr=head;
            ListNode next=curr.next;
      
        int cnt=1;
        while(curr.next!=null)
        {
            
            if(curr.val==val && prev!=null)
            {
                prev.next=curr.next;
                ListNode temp=curr;
                curr=curr.next;
                next=curr.next;
                temp.next=null;
                
            }
            else
            {
                prev=curr;
                curr=next;
               
                next=curr.next;
            }
            
            
            
        }
        if(curr.val==val && prev!=null)
        {
            prev.next=null;
        }
        
        
        if(head.val==val )
       {
           head=head.next;
           ListNode temp=head;
          
       }
        return head;
    }
}