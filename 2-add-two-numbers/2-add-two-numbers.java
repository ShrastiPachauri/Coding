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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int flg=0;
        
        ListNode ans=new ListNode();
        ListNode temp=new ListNode();
        int cnt=0;
        while(l1!=null && l2!=null)
        {
            int x=l1.val+l2.val+cnt;
                ListNode t;
            if(x>=10)
            {t=new ListNode(x%10);
            }
            else
            {
             t=new ListNode(x);
            }
            
            if(flg==0)
            {
                ans=t;
                temp=ans;
                flg=1;
            }
            else
            {
                 temp.next=t;
                temp=t;
            }
                   
                
                cnt=x/10;
            l1=l1.next;
            l2=l2.next;
           
        }
        while(l1!=null)
        {
            int x=l1.val+cnt;
         
                ListNode t;
            if(x>=10)
            {
                t=new ListNode(x%10);
            }
            else
            {
             t=new ListNode(x);
            }
                temp.next=t;
            temp=t;
                cnt=x/10;
            l1=l1.next;
          
            
            
        }
         while(l2!=null)
        {
            int x=l2.val+cnt;
          
                ListNode t;
             if(x>=10)
            {t=new ListNode(x%10);
            }
            else
            {
             t=new ListNode(x);
            }
                temp.next=t;
             temp=t;
                cnt=x/10;
            l2=l2.next;
          
            
            
        }
        
        if(cnt!=0)
        {
            if(cnt>=10)
            {
                ListNode second_last=new ListNode(cnt%10);
                temp.next=second_last;
                temp=second_last;
                cnt=cnt/10;
            }
            ListNode last=new ListNode(cnt);
           
            temp.next=last;
        }
        
        return ans;
        
        
        
    }
}