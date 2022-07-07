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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int cnt=0;
        
        ListNode temp=head;
        
        while(temp!=null)
        {
            cnt++;
            temp=temp.next;
            
        }
        
        int des=cnt-n;
        if(des==0)
        {
            head=head.next;
        }
        else
        {
        temp=head;
        cnt=0;
        while(temp!=null)
        {
            cnt++;
            if(cnt==des)
            {
                ListNode t=temp.next;
                temp.next=t.next;
                t.next=null;
            }
            temp=temp.next;
            
        }
        }
        return head;
        
    }
}