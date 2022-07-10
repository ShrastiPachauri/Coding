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
    public ListNode oddEvenList(ListNode head) {
        
        if(head==null)
        {
            return head;
        }
       ListNode e=new ListNode(head.val);
        ListNode ans=e;
        ListNode temp=head.next;
        int i=1;
        while(temp!=null)
        {
            if(i%2==0 )
            {
                ListNode n=new ListNode(temp.val);
                e.next=n;
                System.out.println("Value of  is"+e.val);
                e=e.next;
            }
            
            temp=temp.next;
            i++;
            
        }
        i=1;
        temp=head.next;
         while(temp!=null)
        {
            if(i%2!=0 )
            {
                ListNode n=new ListNode(temp.val);
                e.next=n;
                System.out.println("Value of  is"+e.val);
                e=e.next;
            }
            
            temp=temp.next;
            i++;
            
        }
       
        return ans;
    }
}