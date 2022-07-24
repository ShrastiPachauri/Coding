class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans=new ArrayList<Integer>();
        if(nums.length<2)
        {
            ans.add(nums[0]);
            return ans;
        }
        
        int cnt1=0;
        int cnt2=0;
        
       int ele1=nums[0];
        int ele2=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==ele1)
            {
                cnt1++;
            }
            else if(nums[i]==ele2)
            {
                cnt2++;
            }
            else if(cnt1==0)
            {
                ele1=nums[i];
                cnt1=1;
            }
            else if(cnt2==0)
            {
                ele2=nums[i];
                cnt2=1;
            
            }
            else
            {
                cnt1--;
                cnt2--;
            }
            
            
        }
        
        
cnt1=0;
        cnt2=0;
        for(int x:nums)
        {
            if(x==ele1)
            {
                cnt1++;
            }
            if(x==ele2)
            {
                cnt2++;
            }
        }
        if(cnt1>(int)Math.floor(nums.length/3))
        {
            ans.add(ele1);
        }
         if(cnt2>(int)Math.floor(nums.length/3) && ele2!=ele1)
        {
            ans.add(ele2);
        }
        return ans;
    }
}