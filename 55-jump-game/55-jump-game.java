class Solution {
    
    
//     public boolean helper(int[] nums,int start)
//     {
       
//         if(start>=nums.length)
//         {
//             return true;
//         }
        
//         for(int i=1;i<=nums[start];i++)
//         {
            
//             boolean res=helper(nums,start+i);
//             if(res==true)
//             {
//                 return true;
//             }
//         }
        
//         return false;
        
//     }
    
    public boolean canJump(int[] nums) {
        int curr=0;
        int max=nums[0];
        if(nums.length<=1)
        {
            return true;
        }
        for(int i=0;i<=max;i++)
        {
             if(max>=nums.length-1)
            {
                return true;
            }
            
            if((i+nums[i])>max)
            {
                max=nums[i]+i;
                System.out.println("max is "+max);
            }
        }
       
        return false;
    }
}