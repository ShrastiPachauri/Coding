class Solution {
    
    int[]dp;
   
    public int jump(int[] nums) {
        dp=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            dp[i]=-1;
        }
        if(nums.length==1)
        {
            return 0;
        }
        dp[nums.length-1]=0;//initialised
        
        for(int i=nums.length-2;i>=0;i--)
        {
           if(nums[i]==0)
           {
               dp[i]=-2;
               continue;
           }
            int min=Integer.MAX_VALUE;
         for(int j=1;j<=nums[i] && i+j<nums.length;j++)
        {
            
              if(dp[i+j]!=-2)
              {
                  if((1+dp[i+j])<min)
                  {
                      min=1+dp[i+j];
                  }
              }

        
        
        
         }
            if(min==Integer.MAX_VALUE)
            {
                dp[i]=-2;
            }
            else
            {
                dp[i]=min;
            }
            
        
        }
       return dp[0];
        
    }
}