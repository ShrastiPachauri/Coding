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
    
    public ListNode f(ListNode head)
    {
        ListNode temp=head;
        if(head.next==null)
        {
            return head;
        }
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        
        ListNode rotated=temp.next;
        temp.next=null;
        
        
        rotated.next=head;
        head=rotated;
        
        return head;
    }
    
    
    
    
    
    
    
    
    
    
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)
        {
            return head;
        }
        ListNode temp=head;
        int cnt=0;
         while(temp!=null)
        {
              cnt++;
            temp=temp.next;
        }
        
        
        
        int effective=k%cnt;
        while(effective-->0)
        {
            head=f(head);
        }
        return head;
    }
}