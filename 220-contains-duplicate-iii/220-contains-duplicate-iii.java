class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        
        for(int i=0;i<nums.length;i++){
            
            int l=i-indexDiff;
            int r=indexDiff+i;
            if(l<0)l=0;
            if(r>=nums.length)r=nums.length-1;
            
            while(l<=r && l!=i){
            
            if( (int)Math.abs(nums[l]-nums[i])<=valueDiff)return true;
            l++;
        }
       
    }
         return false;
}
}