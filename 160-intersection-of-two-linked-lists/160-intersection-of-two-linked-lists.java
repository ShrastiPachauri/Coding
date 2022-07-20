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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        HashSet<ListNode> hs=new HashSet<ListNode>();
        
        ListNode temp=headA;
        
        while(temp!=null)
        {
            hs.add(temp);
            temp=temp.next;
            
        }
        temp=headB;
        
        while(!hs.contains(temp) && temp!=null)
        {
            temp=temp.next;
        }
        
        return temp;
        
        
    }
}