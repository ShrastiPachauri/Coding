class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
        
        
        
        for(int i=0;i<nums.length;i++)
        {
            hs.put(nums[i],i);
            
        }
       
        int[]ans=new int[2];
        int l=0;
        int h=nums.length-1;
       
        for(int i=0;i<nums.length;i++)
        {
            if(hs.containsKey(target-nums[i]) && (hs.get(target-nums[i])!=i))
            {
                ans[0]=i;
                ans[1]=hs.get(target-nums[i]);
                return ans;
            }
        }
        return ans;
        
    }
}