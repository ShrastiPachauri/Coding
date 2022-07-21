class Solution {
    public int[] sortedSquares(int[] nums) {
        //since array is already sorted the max element after sorting would be at eithr of end so taking up two pointer approach
        
        
      int i=0;
        int j=nums.length-1;
        int []ans=new int[nums.length];
        int k=nums.length-1;
        while(i<=j && k>=0)
        {
        if(Math.abs(nums[i])<Math.abs(nums[j]))
        {
            ans[k]=nums[j]*nums[j];
            j--;
            k--;
        }
        else
        {
            ans[k]=nums[i]*nums[i];
            i++;
            k--;
        }
        
        }
        
        return ans;
        
        
        
        
    }
}