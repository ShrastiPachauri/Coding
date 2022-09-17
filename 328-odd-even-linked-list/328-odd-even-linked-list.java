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
        
if(head==null || head.next==null ||head.next.next==null)return head; //atleast three nodes

ListNode temp=head;
ListNode tempnext=head.next;
ListNode oddhead=temp;
ListNode evenhead=temp.next;

while(temp!=null &&  tempnext!=null)
{
temp.next=tempnext.next;    

if(tempnext.next!=null)
{tempnext.next=tempnext.next.next;} 

temp=temp.next;   
tempnext=tempnext.next; 

}
temp=oddhead;
while(temp.next!=null)
{
temp=temp.next;
}
temp.next=evenhead;
return oddhead;
        
    }
}