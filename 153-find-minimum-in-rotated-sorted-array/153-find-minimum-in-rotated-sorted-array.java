class Solution {
    public int findMin(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int mid=low+(high-low)/2;
        
        
        
        
        
        while(high-low>1)
        {
           mid=low+(high-low)/2;
            
          if(nums[mid]<nums[mid-1])
          {
              return nums[mid];
              
          }
            if(nums[mid]>nums[mid-1] )
            {
                if(nums[mid]<nums[nums.length-1])
                {
                high=mid-1;
                }
                else
                {
                     low=mid+1;
                }
            }
           
            
        }
       
            return (nums[high]>nums[low]? nums[low]:nums[high]);
        
        
    }
}