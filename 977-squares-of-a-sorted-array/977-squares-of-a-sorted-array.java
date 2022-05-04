class Solution {
    public int[] sortedSquares(int[] nums) {
        int[]ans=new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            ans[j++]=(int)Math.pow(nums[i],2);
        }
        Arrays.sort(ans);
        return ans;
    }
}