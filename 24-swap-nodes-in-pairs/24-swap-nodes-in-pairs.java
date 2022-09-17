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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)return head;
ListNode temp=head;
ListNode tempnext=head.next;


if(temp!=null && temp.next!=null)
{

temp.next=tempnext.next;

tempnext.next=temp;
head=tempnext;

if(temp.next!=null)
{temp.next=swapPairs(temp.next);}

}
return head;
    }
}