class Solution {
    public int compareVersion(String version1, String version2) {
        
       String[]v1=version1.split("\\.");
        
        String[]v2=version2.split("\\.");
      
        int x=0,y=0;
        int i=0;
       
        for(;i<v1.length;i++)
        {
            if(i==v2.length)break;
             x=Integer.parseInt(v1[i]);
           
            y=Integer.parseInt(v2[i]);
            
            if(x>y)
            {
                return 1;
            }
            else if(x<y)
            {
                return -1;
            }
        }
        //System.out.println("i is "+i+" v2 length is "+v2.length);
        
         while(i<v1.length)
       {
           if(Integer.parseInt(v1[i])>0)
           {
               return 1;
           }
           i++;
       }
        
        
        
        
        
        
       while(i<v2.length)
       {
           if(Integer.parseInt(v2[i])>0)
           {
               return -1;
           }
           i++;
       }
        
        
        
        return 0;
        
    }
}