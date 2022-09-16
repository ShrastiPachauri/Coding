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
    public ListNode deleteDuplicates(ListNode head) {
        
if(head==null || head.next==null)return head;

ListNode curr=head;
ListNode currnext=head.next;

while(currnext!=null)
{
if(curr.val==currnext.val)
{
curr.next=currnext.next;
currnext=curr.next;
}
else
{

curr=currnext;
currnext=curr.next;
}

}

return head;
        
    }
}
