class Solution {
    public int maxProfit(int[] nums) {
        int max=0;
        int start=0;
        int end=0;
        
        
        for(int i=0;i<nums.length;i++) 
        {
          if(nums[i]<nums[start])
          {
              start=i;
              if(end<start)
              {
                  end=start;
              }
              
             
          }
           if(nums[i]>nums[end])
           {
               end=i;
               if(max<(nums[end]-nums[start]))
              {
                  max=nums[end]-nums[start];
              }
           }
            
            
            
            
        }       
        return max;
        
        
        
        
        
        
        
        
    }
}