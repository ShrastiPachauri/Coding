class Solution {
    

   
    public int longestPalindrome(String s) {
        int cnt=0;
        
        char [] arr=s.toCharArray();
        Arrays.sort(arr);
        
        Stack<Character> st=new Stack<Character>();
       
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