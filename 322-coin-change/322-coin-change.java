class Solution {
       
    long dp[][];
    public long countcoins(int[]coins,int size,int sum,long[][]dp){
        
       
        for(int i=0;i<=size;i++){
            dp[i][0]=0;
        }
         for(int j=0;j<=sum;j++){
            dp[0][j]=Integer.MAX_VALUE;
        }
        
        for(int i=1;i<=size;i++){
        for(int j=1;j<=sum;j++)
        {
    
        if(coins[i-1]<=j){
            
            dp[i][j]=Math.min(1L+dp[i][j-coins[i-1]],dp[i-1][j]);
        }
        else{
        dp[i][j]= dp[i-1][j];
        }
        }
        }
        return dp[size][sum];
    }
    public int coinChange(int[] coins, int amount) {
        dp=new long[coins.length+1][amount+1];
	   //for(long[] x:dp){
	   //    Arrays.fill(x,-1);
	   //}
	   long ans=countcoins(coins,coins.length,amount,dp);
	   if(ans>=Integer.MAX_VALUE){
	       return -1;
	   }
	    return (int)ans;
	    
    }
}