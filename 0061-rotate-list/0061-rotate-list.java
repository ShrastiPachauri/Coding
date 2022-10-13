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
        
        //1-2-3 4-5 ,k=2,=>4-5-1-2-3
        
        int cnt=0;
        ListNode temp=head;
        while(temp!=null){
            cnt++;//counted
            temp=temp.next;
        }
        int rotation=k%cnt;
        k=rotation;
        if(k==0)return head;
        
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast!=null && k>0){
            k--;
            fast=fast.next;
        }
        
        while(fast.next!=null){
            
            slow=slow.next;
            fast=fast.next;
        }
        
        ListNode newhead=slow.next;
        slow.next=null;
        fast.next=head;
        return newhead;
        
        
        
        
    }
}