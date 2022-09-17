/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode head1, ListNode head2) {
        //count nodes in list1
ListNode temp=head1;
int count1=0;
while(temp!=null)
{temp=temp.next;
count1++;
}
//count nodes in list2
int count2=0;
temp=head2;//reset to head

while(temp!=null)
{
temp=temp.next;
count2++;
}
int  steptoreach=(int)Math.abs(count1-count2);
ListNode traverseFirst=count2>count1?head2:head1;
temp=traverseFirst;
while(steptoreach>0)
{
temp=temp.next;
steptoreach-=1;
}
ListNode temp2=traverseFirst==head1?head2:head1;

while(temp!=temp2)
{temp=temp.next;
temp2=temp2.next;
}
return temp;

    }
}