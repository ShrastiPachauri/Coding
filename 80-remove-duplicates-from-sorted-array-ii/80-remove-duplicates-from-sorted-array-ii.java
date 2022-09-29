class Solution {
    public int removeDuplicates(int[] nums) {
        // 1 1 2 3 3 3 4  -->1 1 2 3 3 4
        
        boolean ignore=true;
        int l=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[l] && ignore==true){
                 nums[l+1]=nums[i];
                ignore=false;
                l++;
                continue;
            }
            else if(nums[i]==nums[l] && ignore==false)
            {
                continue;
            }
            else //unique val
            {
                nums[l+1]=nums[i];
                l++;
                ignore=true;
            }
        }
         return l+1;
        
    }
}