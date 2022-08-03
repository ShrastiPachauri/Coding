class Solution {
    
     
    public int f(int[] nums, int target ,int index,int sum) {
        
        if(index==nums.length && sum==target)
        {
            return 1;
        }
        if(index==nums.length )
        {
            return 0;
        }
        
        
       int a=f(nums,target,index+1,sum+nums[index])+f(nums,target,index+1,sum-nums[index]);
        
        
        return a;
        
        
    }
    
    
    public int findTargetSumWays(int[] nums, int target) {
        
        int ans=f(nums,target,0,0);
        return ans;
        
        
    }
}