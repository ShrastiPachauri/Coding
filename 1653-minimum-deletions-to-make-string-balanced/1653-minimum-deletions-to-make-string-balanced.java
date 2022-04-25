class Solution {
    public int minimumDeletions(String s) {
        int flag=0,del=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='b')
            {
                flag++;
            }
            
            if(s.charAt(i)=='a' && flag!=0)
            {
                 del+=flag;
                flag=0;
               
            }
          
        }
        int flg=0,dl=0;
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='b')
            {
                flg++;
            }
            
            if(s.charAt(i)=='a' && flg!=0)
            {
                dl++;
                flg--;
               
            }
          
        }
        
        return (int)Math.min(del,dl);
    }
}