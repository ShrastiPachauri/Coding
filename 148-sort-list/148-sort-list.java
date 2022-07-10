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
    public ListNode sortList(ListNode head) {
        
        
        if(head==null)
        {
            return head;
        }
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
        ListNode temp=head;
       
        while(temp!=null){
            pq.add(temp.val);
            //System.out.println("value "+pq.peek());
            temp=temp.next;
            
            
        }
        ListNode ans=new ListNode(pq.remove());
     
        temp=ans;
        while(pq.size()>0)
        {
            
            ListNode n=new ListNode(pq.remove());
            temp.next=n;
            temp=temp.next;
         
            
            
        }
        
        
        return ans;
        
        
        
        
        
        
        
    }
}