class Solution {
    
    int dp[];
    public int robbery(int[]nums,int index){
        
       
        if(index<0 || index>=nums.length){
            return 0;
        }
       
       //take
         if(dp[index]!=-1 )return dp[index];
        int x=nums[index]+robbery(nums,index+2);
        
        int y=robbery(nums,index+1);
        return dp[index]=(int)Math.max(x,y);
        
    }
    
    
    
    
    public int rob(int[] nums) {
        dp=new int[nums.length];
        Arrays.fill(dp,-1);
   return robbery(nums,0);
       
        
       
    }
}