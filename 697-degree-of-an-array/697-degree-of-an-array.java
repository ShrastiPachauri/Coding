class Solution {
    public int findShortestSubArray(int[] nums) {
        
        
        HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
         HashSet<Integer> maxi=new HashSet<Integer>();
        
        for(int i=0;i<nums.length;i++)
        {
            hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);
            
            
        }
       
        
        int max=1;
        int Key=1;
        for(Map.Entry<Integer,Integer> x:hs.entrySet())
        {
            int v=x.getValue();
            if(v>max)
            {
                max=v;
                Key=x.getKey();
            }
           
           
            
        }
        
        for(Map.Entry<Integer,Integer> x:hs.entrySet())
        {
            int v=x.getValue();
            if(v==max)
            {
                maxi.add(x.getKey());
            }
           
           
            
        }
       int length=nums.length;
      
        
       for(int x:maxi)
       {
           int start=0;
           int flg=0;
           int end=0;
        for(int j=0;j<nums.length;j++)
       {
           if(nums[j]==x)
           {
               if(flg==0)
               {flg=1;
                   start=j;
                   end=start;//otherwise strt will increment and if no other freq end will remain 0 i.e less than start
               }
               else
               {
                   end=j;
               }
           }
           
        }
           
           if((end-start+1)<length)
           {
               length=(end-start+1);
           }
       }
    return (length);
        
        
        
        
    }
}