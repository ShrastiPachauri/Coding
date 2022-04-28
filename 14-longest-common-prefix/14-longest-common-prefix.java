class Solution {
    public String longestCommonPrefix(String[] strs) {
        
       
        
        for(int i=0;i<strs[0].length();i++)
        {
            int flag=0;
        for(String x:strs)
        {
          
            if((i>=x.length())||(x.charAt(i)!=strs[0].charAt(i)))
            {
            flag=1;
                break;
                
                 
             } 
        }
           
           if(flag==1)
            {
                return strs[0].substring(0,i);
                
            }
        
    }
        
        return strs[0];
        
}
}