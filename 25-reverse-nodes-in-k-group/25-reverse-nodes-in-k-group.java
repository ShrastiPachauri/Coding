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
    public ListNode reverseKGroup(ListNode head, int k) {  
       if(head==null||head.next==null)return head;
ListNode temp=head;
for(int i=0;i<k-1;i++)
{
temp=temp.next;
    if(temp==null)return head;//not sufficient nodes 
}

temp.next=reverseKGroup(temp.next,k);
ListNode last=temp;
while(last!=head)
{ListNode lastnext=temp.next;
ListNode currnext=head.next;
head.next=temp.next;
temp.next=head;
head=currnext;
}
return head;

}
}