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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||k==0)return head;
       int count=0;

ListNode temp=head;

while(temp!=null)//to count nodes
{
temp=temp.next;
count++;
}
//count is total nodes in list
if(k>=count)k=k%count;//efective rotation
       
if(k==0)return head;
count=count-k;
temp=head;

while(count-->1)
{
temp=temp.next;

}
ListNode newhead=temp.next;
temp.next=null;
temp=newhead;

while(temp.next!=null)
{
temp=temp.next;

}
temp.next=head;
head=newhead;

return head;
    }
}