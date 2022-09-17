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
    public ListNode removeNthFromEnd(ListNode node, int n) {
        int count=0;

ListNode temp=node;
while(temp!=null)
{
temp=temp.next;
count++;
}
count=count-n;//the node upto which, have to traverse
if(count==0)
{node=node.next;
return node;
}
if(count<0)return node;
temp=node;
while(count-->1)
{temp=temp.next;
}
//removal
ListNode t=temp.next;
temp.next=temp.next.next;
t.next=null;
return node;
    }
}