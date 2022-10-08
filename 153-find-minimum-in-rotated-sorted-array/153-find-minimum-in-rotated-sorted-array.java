class Solution {
    public int findMin(int[] nums) {
        //to get 0th elemnet
        int l=0;
        int h=nums.length-1;
        
        
        
        int mid=l+(h-l)/2;
        int min=Integer.MAX_VALUE;
        while(l<=h){
            
            mid=l+(h-l)/2;
            if(nums[mid]<min)min=nums[mid];
          if((nums[mid]-nums[nums.length-1])>0){
              l=mid+1;
          }
         else
         {
             h=mid-1;
         }
            
            
        }
        
        return min;
    }
}