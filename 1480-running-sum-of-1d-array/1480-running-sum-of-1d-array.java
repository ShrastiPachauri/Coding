class Solution {
    public int[] runningSum(int[] nums) {
        
        int x=0;
        int[]res=new int[nums.length];
        int i=0;
        for(int y:nums)
        {
            x+=y;
            res[i++]=x;
        }
        return res;
    }
}