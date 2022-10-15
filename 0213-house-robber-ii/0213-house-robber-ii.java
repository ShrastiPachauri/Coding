class Solution {
    int[]dp;
    public int robbery(int[]nums,int start,int end){
        
         
        if(end==start)return nums[start];
       if(end<=0)return 0;
        if(dp[end]!=-1)return dp[end];
        
       
        
       int l= nums[end]+robbery(nums,start,end-2);
        
        int r=0+robbery(nums,start,end-1);
        
        return dp[end]=(int)Math.max(l,r);
    }
    
    public int rob(int[] nums) {
        dp=new int[nums.length+1];
        Arrays.fill(dp,-1);
        if(nums.length<=2)return (int)Math.max(nums[0],nums[nums.length-1]);
        int op1=robbery(nums,0,nums.length-2);
        dp=new int[nums.length+1];
         Arrays.fill(dp,-1);
        int op2=robbery(nums,1,nums.length-1);
        return (int)Math.max(op1,op2);
    }
}