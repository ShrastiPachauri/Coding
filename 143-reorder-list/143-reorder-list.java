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
    
public ListNode rotateByOne(ListNode head)
{
    ListNode temp=head;
if(temp==null||temp.next==null)return head;

while(temp.next.next!=null)
{
temp=temp.next;
}
ListNode last=temp.next;//last node of given list
temp.next=null;
last.next=head;
head=last;
return head;

}
    
public void reorderList(ListNode head) {
if(head==null)return ;                                                           
ListNode temp=head;

while(temp!=null && temp.next!=null)
{temp.next=rotateByOne(temp.next);
temp=temp.next.next;

}

return;
    }
}