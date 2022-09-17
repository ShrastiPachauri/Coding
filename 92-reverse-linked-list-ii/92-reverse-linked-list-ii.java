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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int count=1;

ListNode temp=head;
ListNode leftNode=null;
ListNode rightNode=null;
ListNode afterRight=null;
ListNode beforeLeft=null;
while(temp!=null)//to count nodes
{
if(count==left)leftNode=temp;
if(count==left-1)beforeLeft=temp;
if(count==right)
{rightNode=temp;
afterRight=temp.next;
break;
}
temp=temp.next;
count++;
}
if(leftNode==rightNode || rightNode==null||leftNode==null)return head;
//reverse the sublist

ListNode prev=leftNode;
ListNode curr=leftNode.next;
ListNode next=curr.next;
while(curr!=null && prev!=rightNode)    //1-2-3-4-5
{
next=curr.next;
curr.next=prev;
prev=curr;
curr=next;

}
        if(beforeLeft!=null)
        {beforeLeft.next=rightNode;}
        else
        {
            head=rightNode;
        }
leftNode.next=afterRight;

return head;
    }
}