class Solution {
    public int longestConsecutive(int[] nums) {
       Arrays.sort(nums);
        if(nums.length<1)
        {
            return 0;
        }
        int max=1;
        int curr=nums[0];
        int cnt=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]-curr==1 )
            {
                cnt++;
                curr=nums[i];
            }
            else if(nums[i]-curr==0)
            {
                continue;
            }
            else
            {
                max=(int)Math.max(cnt,max);
                cnt=1;
                curr=nums[i];
            }
        }
        max=(int)Math.max(cnt,max);
        
        return max;
        
    }
}