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
        int cnt=k-1;
        //1-2-3-4
        while(temp!=null && cnt>0){
             cnt--;
            temp=temp.next;
        }
        if(temp==null)return head;//can't reverse
       
        ListNode newhead=reverseKGroup(temp.next,k);
    temp.next=newhead;
        
      ListNode last=temp;
        ListNode currnext=head.next;
        
        while(last!=head){
            
            currnext=head.next;
            head.next=temp.next;
            temp.next=head;
            head=currnext;
            
        }
        return head;
        
        
    }
}