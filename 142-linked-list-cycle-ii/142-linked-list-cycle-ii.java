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
if(head==null||head.next==null)return null;
ListNode slow=head.next;
ListNode fast=head.next.next;


while(fast!=null && slow!=fast)
{
slow=slow.next;
fast=fast.next;
if(fast!=null)fast=fast.next;
}

if(fast==null)return null;

slow=head;

while(slow!=fast)
{
slow=slow.next;
if(slow==fast)break;
fast=fast.next;
}
return slow;
    }
}