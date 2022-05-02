class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        
         int []ans=new int[nums.length];
        int i=0;
        for(int x:nums)
        {
            if(x%2==0)
            {
                ans[i++]=x;
            }
        }
        
        for(int x:nums)
        {
            if(x%2!=0)
            {
                ans[i++]=x;
            }
        }
       
       
        
        
        return ans;
        
        
        
    }
}