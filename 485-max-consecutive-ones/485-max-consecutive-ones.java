class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int cnt=0;
        int max=0;
        int flg=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1 && flg==0)
            {
                flg=1;
                cnt++;
            }
            else if(nums[i]==1 && flg!=0)
            {
                cnt++;
            }
            else
            {
              if(cnt>max)
              {
                  max=cnt;
              }
                flg=0;
                cnt=0;
            }
            
        }
        if(cnt>max)
              {
                  max=cnt;
              }
        return max;
        
    }
}