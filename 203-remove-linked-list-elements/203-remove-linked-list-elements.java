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
    public ListNode removeElements(ListNode head, int value) {
       if(head==null)return head;

while(head!=null && head.val==value)
{
head=head.next;
}
ListNode prev=null;
ListNode curr=head;

while(curr!=null)
{
if(curr.val==value) //to be removed
{
ListNode next=curr.next;
prev.next=curr.next;
curr.next=null;
curr=next;

}
else
{
prev=curr;
curr=curr.next;
}
}
        
        return head;
    }
}