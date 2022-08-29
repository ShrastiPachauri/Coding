class Solution {
    String ans="";
    public String longestPalindrome(String s) {
       
        for(int i=0;i<s.length();i++)
        {
            palindrome(s,i,i);
           palindrome(s,i,i+1);
            
        }
        return ans;
    }
    
    public String palindrome(String s,int i,int j)
    {
      
        if(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j))
        {
       
          ans= s.substring(i,j+1).length()>ans.length()?s.substring(i,j+1):ans;
           
         palindrome(s,i-1,j+1);
            
        }
        
        return ans;
        
        
    }
}