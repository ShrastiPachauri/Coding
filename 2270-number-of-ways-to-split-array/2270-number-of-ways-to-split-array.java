class Solution {
    public int waysToSplitArray(int[] nums) {
        
     
        long sum=0;
        int cnt=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        long ssum=0;
        for(int i=0;i<nums.length-1;i++)
        {
            ssum+=nums[i];
            if(ssum>=(sum-ssum) )
            {
                cnt++;
            }
        }
        
        return cnt;
    }
}