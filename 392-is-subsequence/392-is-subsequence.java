class Solution {
    public boolean isSubsequence(String s, String t) {
        
        
        
        
        if(s.length()<=0)
        {
            return true;
        }
        if(t.length()<s.length())
        {
            return false;
        }
        
        
        int in=0;
        char []arr=s.toCharArray();
     for(int i=0;i<t.length();i++)
        {
        
        if(t.charAt(i)==arr[in])
        {
            in++;
            if(in==s.length())
            {
                return true;
            }
        }
         
        
        
     }
       if(in<s.length())
       {
           return false;
       }
        return true;
    
        
    }
}