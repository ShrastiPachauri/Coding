class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0;
        int h=nums.length-1;
        int mid=l+(h-l)/2;
        while(l<h)
        {
            mid=l+(h-l)/2;
            //System.out.println("mid is"+nums[mid]);
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[mid]<target)
            {
                l=mid+1;
            }
            else
            {
                h=mid-1;
            }
            
        }
       if(nums[l]<target)
       {
           return l+1;
       }
        else
        {
            return l;
        }
        
    }
}