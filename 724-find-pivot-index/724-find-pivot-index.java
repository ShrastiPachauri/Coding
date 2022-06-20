class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int x:nums)
        {
            sum+=x;
        }
         //System.out.println("sum is    "+sum);
        int currsum=0;
       for(int i=0;i<nums.length;i++)
       {
           if(currsum==(sum-currsum-nums[i]))
           {
               return i;
           }
          currsum+=nums[i];
           //System.out.println(currsum+"   "+(sum-currsum));
           
           
           
       }
        
        return -1;
        
        
        
    }
}