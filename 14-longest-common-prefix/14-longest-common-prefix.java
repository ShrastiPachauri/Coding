class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        StringBuilder prefix=new StringBuilder();
        
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
           if(flag==0)
           {
               prefix.append(strs[0].charAt(i));
           }
            else
            {
                break;
            }
        
    }
        
        return prefix.toString();
        
}
}