class Solution {
    public int majorityElement(int[] nums) {
        double limit=nums.length/2.0;
        int cnt=1;
        int element=nums[0];
        
        for(int i=1;i<nums.length;i++)
        {
            if(cnt>=1 )
            {
                if(nums[i]==element)
                {
                    cnt++;
                }
                else
                {
                    cnt--;
                }
            }
            else
            {
                element=nums[i];
                cnt++;
            }
           
        }
        
       return element;
        
    }
}