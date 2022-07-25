class Solution {
    public static int dp[][];

 Boolean f(int N, int arr[], int sum){
    if(sum==0)
        {
            return true;
        }
        
        if(N==0||sum<0)
        {
            return false;
        }
        if(dp[N][sum]!=-1)
        {
            if(dp[N][sum]==1)
            {
                return true;
            }
            return false;
        }
        
        
        boolean ans=f(N-1,arr,sum-arr[N-1])||f(N-1,arr,sum);
        if(ans==true)
        {
            dp[N][sum]=1;
        }
        else
        {
            dp[N][sum]=0;
        }
        return ans;
    
}
    
    
    
    
    public boolean canPartition(int[] nums) {
        
       
       
        int sum=0;
        for(int x:nums)
        {
            sum+=x;
        }
        if(sum%2!=0)
        {
            return false;
        }
        
        dp=new int[nums.length+1][sum/2 +1];
         for(int i=0;i<=(nums.length);i++)
        {
            for(int j=0;j<=(sum/2);j++)
            {
                dp[i][j]=-1;
            }
        }
        
        return f(nums.length,nums,sum/2);
        
        
    }
}