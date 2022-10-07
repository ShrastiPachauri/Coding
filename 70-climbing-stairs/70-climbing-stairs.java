class Solution {
    int dp[];
    public int steps(int n,int[]dp){
       
        int x=0,y=0;
        if(n<=1)return 1;
         if(dp[n]!=-1)return dp[n];
        x=steps(n-1,dp);
        if(n>1){
            y=steps(n-2,dp);
        }
        return dp[n]=x+y;
    }
    
    
    public int climbStairs(int n) {
        dp=new int[n+1];
        Arrays.fill(dp,-1);
        return steps(n,dp);
    }
}