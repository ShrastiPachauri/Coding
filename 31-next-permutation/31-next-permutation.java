class Solution {
    
    public void reverse(int start,int[]nums)
    {
        
        for(int i=start+1,j=nums.length-1;i<=j;i++,j--)//reversing the suffix
        {
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
          
        }
        
     
        
    }
    
   
    public void nextPermutation(int[] nums) {
        int start=-1;
        if(nums.length<=1)
        {
            return;
        }
        
         if(nums.length==2)//swap the last two values in case of completely incresing 
        {
            int temp=nums[nums.length-1];
            nums[nums.length-1]=nums[nums.length-2];
            nums[nums.length-2]=temp;
            return;
        }
        
        
        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                start=i;//pivot
                
        if(start>=0)
        {
            for(int j=nums.length-1;j>start;j--)
        {
            if(nums[j]>nums[start])//start -1 must exist
            {
                 int temp=nums[start];
            nums[start]=nums[j];
            nums[j]=temp;
                
                reverse(start,nums);
                return;
            }
         
        }
        }
            }
        }
        
       
      if(start==-1)//incresing array
      {
          reverse(-1,nums);
      }
      
       
        
       
    }
}