class Solution {
    
    int[][]dp;
    public int LIS(int[]nums,int index,int prev){
        int x=0,y=0;
        if(index>=nums.length)return 0;
        if( prev!=Integer.MIN_VALUE && dp[index][prev]!=-1 )return dp[index][prev];
        
       if(prev==Integer.MIN_VALUE||nums[index]>nums[prev]){
           x=1+LIS(nums,index+1,index);
           y=0+LIS(nums,index+1,prev);
           if(prev!=Integer.MIN_VALUE)dp[index][prev]=Math.max(x,y);
           return (int)Math.max(x,y);
       }
        else
        {
           
            return LIS(nums,index+1,prev);
        }
        
        
    }
    
    
    public int lengthOfLIS(int[] nums) {
        dp=new int[nums.length+1][nums.length+1];
        for(int[]x:dp)
        {Arrays.fill(x,-1);}
        return LIS(nums,0,Integer.MIN_VALUE);
        
    }
}