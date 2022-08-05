class Solution {
    int[]dp;
    public boolean f(int[]arr,int index)
    {
        if(dp[index]!=-1)
        {
            if(dp[index]==1)
            {
                return true;
            }
            return false;
        }
        if(index==arr.length-1)
        {
            return true;
        }
        if(index>=arr.length)
        {
            
            return false;
            
        }
        if(arr[index]==0)
        {
            return false;
        }
        for(int i=1;i<=arr[index];i++)
        {
            boolean ans=f(arr,index+i);
            
            if(ans==true)
            {
                dp[index]=1;
                return true;
            }
        }
        dp[index]=0;
        return false;
        
        
        
    }
   
    public boolean canJump(int[] nums) {
        dp=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            dp[i]=-1;
        }
        return f(nums,0);
    }
}