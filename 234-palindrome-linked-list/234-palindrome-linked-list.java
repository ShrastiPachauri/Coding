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
    public boolean isPalindrome(ListNode head) {
        
if(head==null)return true;
int count=0;

ListNode temp=head;
while(temp!=null)
{
temp=temp.next;
count++;
}
if(count<=1)return true; 
if(count==2 )
{if(head.val==head.next.val)return true;
return false;
}
        
count=count/2;  //n=4,cnt=2

temp=head;
while(count-->0)/**good point -->**/
{
temp=temp.next;
}
//reverse

ListNode prev=temp;
ListNode curr=temp.next;
ListNode next=curr.next;

while(curr!=null)
{
next=curr.next;
curr.next=prev;
prev=curr;
curr=next;

}
//prev node is tail node to  traverse in reverse
temp=head;//reset
while(temp.val==prev.val)
{
temp=temp.next;
prev=prev.next;
if(temp==prev||prev.next==temp)return true;
}

return false;
    }
}