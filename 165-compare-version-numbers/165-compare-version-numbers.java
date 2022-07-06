class Solution {
    public int compareVersion(String version1, String version2) {
        String[] arr1=version1.split("\\.");
        String[]arr2=version2.split("\\.");
        
        
       // System.out.println("lengths of arr1 and 2 are "+arr1.length+" "+arr2.length);
        
        
        
        
        int i=0;
        
        
        for(i=0;i<arr1.length;i++)
        {
            
                if(i>=arr2.length)
                   {
                    if(Integer.parseInt(arr1[i])>0)
                    {return 1;}
                    else
                    {
                        continue;
                    }
                   
                }
//System.out.println("after parsing"+Integer.parseInt(arr1[i])+" "+Integer.parseInt(arr2[i]));
            if(Integer.parseInt(arr1[i])<Integer.parseInt(arr2[i]))
            {
                return -1;
            }
            else if(Integer.parseInt(arr1[i])>Integer.parseInt(arr2[i]))
            {
                return 1;
            }
            else
                continue;
        }
        
        if(arr2.length>arr1.length)
        {
            while(i<arr2.length)
            {if(Integer.parseInt(arr2[i])>0)
                   {
                       return -1;
                   }
             i++;
            }
            
        }
        
        return 0;
        
    }
}