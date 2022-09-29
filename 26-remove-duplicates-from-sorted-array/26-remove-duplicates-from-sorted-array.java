class Solution {
    public int removeDuplicates(int[] nums) {
        //1 2 3 4 4 4-->1 2 3 4
        int l=0;
        int r=0;
        if(nums.length==1)return 1;
        
        
        for( r=0;r<nums.length;r++){
            
            if(nums[r]!=nums[l]){
                nums[l+1]=nums[r];
                l++;
            }
           
        }
        return l+1;
        
        
        
        
        
        
        
        
        
        
        
    }
}