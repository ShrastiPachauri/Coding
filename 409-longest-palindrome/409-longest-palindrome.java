class Solution {
    
    
    
    
//     public boolean isPalindrome(String x)
//     {  for(int i=0;i<=x.length()/2;i++)
//         {
//             if(x.charAt(i)!=x.charAt(x.length()-i-1))
//             {
                
//                 return false;
                
//             }
   
//         }
//      System.out.println("palindrome is "+x);
//      return true;
//     }
   
    public int longestPalindrome(String s) {
        int cnt=0;
        
        char [] arr=s.toCharArray();
        Arrays.sort(arr);
        
        Stack<Character> st=new Stack<Character>();
        System.out.println("Arrays after sort"+ arr.toString());
        for(Character x:arr)
        {
            if(st.size()==0)
            {
                st.add(x);
                continue;
            }
            
            if(st.peek()==x)
            {
                st.pop();
                cnt+=2;
                continue;
            }
            else
            {
                st.add(x);
            }
            
        }
        
        if(cnt==s.length())
        {
            return cnt;
        }
   
        return (cnt+1);
}
}