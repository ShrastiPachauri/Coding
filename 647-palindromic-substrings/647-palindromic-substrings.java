class Solution {
    
   
    int cnt=0;
    public int countSubstrings(String s) {
        
        for(int i=0;i<s.length()-1;i++)
        {
            check(s,i,i);
            check(s,i,i+1);
          
        }
        return cnt+1;//for last singleton substring at last index
    }
    
    public void check(String s,int i,int j)
    {
        
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j))
        {
            cnt++;
            
            i--;
            j++;
        }
        return;
        
        
        
    }
    
    
    
    
    
    
    
}