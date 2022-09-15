class Solution {
    
    
    public int findWays(int[]nums,int target,int sum,int index,int[]ans)
    {
        if(sum==target && index==nums.length)ans[0]++;
        if(index==nums.length)return ans[0];
        
        
        
        //choices 
        
       
        findWays(nums,target,sum-nums[index],index+1,ans);
        findWays(nums,target,sum+nums[index],index+1,ans);
        
        
        return ans[0];
        
        
    }
    
    public int findTargetSumWays(int[] nums, int target) {
        
        int ans[]=new int[1];
        return findWays(nums,target,0,0,ans);
        
        
        
        
        
    }
}