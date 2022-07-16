/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null)
        {
            return null;
        }
        int flg=0;
        ListNode slow=head;
        ListNode fast=head;
        if(head.next==null )
        {
            return null;
        }
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {flg=1;
                break;//cycle detected
            }
        }
        if(flg==0)
        {
            return null;
        }
        
        slow=head;
        
        while(slow!=fast && flg==1)//after cycle detection only
        {
            slow=slow.next;
            fast=fast.next;
        }
        
        return slow;
        
        
       
}
}