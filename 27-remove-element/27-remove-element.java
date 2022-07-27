class Solution {
    public int removeElement(int[] nums, int val) {
       int cnt=0;
        int flg=0;
        int n=nums.length;
        for(int i=0;i<n;)
        {
            if(nums[i]!=val)
            {
               
                i++;
                continue;
            }
            if(nums[i]==val )
            {
         for(int j=i;j<nums.length-1;j++)
         {
             
             nums[j]=nums[j+1];
             
         }
                n--;
             if(i==nums.length-1)
             {
                 i++;
             }
            }
         
            
        }
        return (n);
    }
}