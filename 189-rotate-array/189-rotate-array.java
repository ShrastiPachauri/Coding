class Solution {
    
    
 
    
    public void rotate(int[] nums, int k) {
        
        if(k>nums.length)
        {
            int div=k/nums.length;
           k=k-((div)*(nums.length));
        }
       int in=0;
        int i=nums.length-k;
        int t=nums.length;
       int []res=new int[nums.length];
        while(t-->0)
        {
            res[in]=nums[i%(nums.length)];
            in++;
          
            i++;
          
    }
        i=0;
        for(int x:res)
        {
            nums[i++]=x;
        }
}
}