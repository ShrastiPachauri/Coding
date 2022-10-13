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
    
    public ListNode reverse(ListNode temp){
        
        ListNode prev=temp;
        ListNode curr=temp.next;
        ListNode next=curr.next;
        
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            
        }
        
        return prev;
        
        
    }
    
    public boolean isPalindrome(ListNode head) {
        //cnt nodes at ,be at middle 
        if(head==null)return true;
        int cnt=0;
        ListNode t=head;
        while(t!=null){
            cnt++;
            t=t.next;
            
        }
        if(cnt<=2){
            
            if(cnt==1)return true;
            if(head.val==head.next.val)return true;
            
        }
        
        
        cnt=(cnt+1)/2;
        t=head;
        for(int i=1;i<cnt;i++){
            
            t=t.next;
        }
       
        //reverse 
        ListNode tail=reverse(t);
        t=head;
        while(tail.val==t.val){
            
           if(tail.next==t || tail.next==t.next)return true;
            tail=tail.next;
            t=t.next;
        }
        return false;
        
        
        
    }
}