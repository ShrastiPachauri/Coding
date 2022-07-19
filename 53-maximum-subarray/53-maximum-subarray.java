class Solution {
    public int maxSubArray(int[] nums) {
        
          int max=nums[0];
       
        int curr=0;
        for(int i=0;i<nums.length;i++)
        {
            
         int x=curr+nums[i];
            if(x>max)
            {
                max=x;
            }
       if(x<0)
       {
           curr=0;
       }
        if(x>=0)
        {
            curr=x;
            
        }
        }
        
        return max;
    }
}