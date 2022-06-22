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
        
        if(head==null)
        {
            return false;
        }
        ListNode slow=head;
        ListNode fast=head;
        Stack<Integer> s=new Stack<Integer>();
        
      int cnt=1;
        while(fast!=null )
        {s.push(slow.val);
       
        
            slow=slow.next;
           
           fast=fast.next;
         
            if(fast!=null)
            {
                cnt++;
                fast=fast.next;
                if(fast!=null)
                {
                    cnt++;
                }
                
            }
            
        }
        // System.out.println("cnt "+cnt);
        if(cnt<=1)
        {
            return true;
        }
       if(cnt%2!=0)
       {
           s.pop();//pop the centre unique value
       }
        while(slow!=null)
            {
            
            if(s.peek()!=slow.val)
            {
                return false;
            }
            s.pop();
                slow=slow.next;
            }
        
        if(s.size()!=0)
        {
            return false;
        }
        return true;
        
    }
}