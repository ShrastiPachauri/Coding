class Solution {
   
    public int minSubArrayLen(int target, int[] nums) {
         int min=Integer.MAX_VALUE;
    int l=0;
    int r=0;
    int sum=0;
        int s=0;
        for(int x:nums){
            s+=x;
        }
        
        if(s<target)return 0;
        
        
        for(int i=0;i<nums.length;){
            
            if(min>(r-l) && sum>=target)min=r-l;
                while(sum>=target ){
                    sum-=nums[l];
                    l++;
                  if(sum>=target){
                      if(min>(r-l) && sum>=target)min=r-l;
                  }
                }
            
            
            if(sum<target){
                sum+=nums[i];
               i++;
                r++;
            }
         
                
        }
                 if(sum>=target){
                      if(min>(r-l) && sum>=target)min=r-l;
                  }
        
              while(sum>target){
                    sum-=nums[l];
                  l++;
                  if(sum>=target){
                      if(min>(r-l) && sum>=target)min=r-l;
                  }
                    
                }
        
        return min;
        
        
        
        
    }
}