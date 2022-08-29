class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        //brute force n^2 ,two for loops
        
        //better
        //O(n) space and time
        
        Stack<Integer> st=new Stack<Integer>();
        int[]ans=new int[nums.length];
        
    
        
        for(int i=0;i<nums.length;i++)
        {
            int flg=0;
            int j=i+1;
          for(j=(i+1);j<nums.length;j++)
          {
             if(nums[j]>nums[i])
             {
                 ans[i]=nums[j];
                 flg=1;
                 break;
             }
              
          }
        
        
         if(j>=nums.length-1 && flg==0)
         {
             for(int start=0;start<i;start++)
             {
                 if(nums[start]>nums[i])
                 {
                     ans[i]=nums[start];
                     flg=1;
                     break;
                 }
             }
            
         }
        if(flg==0)
        {
            ans[i]=-1;
        }
    }
        return ans;
}
}