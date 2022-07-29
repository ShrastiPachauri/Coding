class Solution {
       
      String ans="";
        int max=0;
    public String longestPalindrome(String s) {
     
        
        for(int i=0;i<s.length();i++)
        {
            
            check(s,i,i);
            check(s,i,i+1);
            
        }
        return ans;
        
    }
    
    public void check(String s,int i,int j)
    {
        while(i>=0 && j<s.length()&& s.charAt(i)==s.charAt(j))
        {
          i--;
            j++;
            
        }
        
          
           if(max<(j-i-1 ))
           {
               max=j-i-1;
               ans=s.substring(i+1,j);
           }
            
        
        
        
    }
}