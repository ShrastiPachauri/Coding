class Solution {
    public int search(int[] nums, int target) {
        int rotated=0;
        int valley=-1;
        
        if(nums.length<=3)
        {
            if(nums.length>0 && nums[0]==target)
            {
                return 0;
            }
            if(nums.length>1 && nums[1]==target)
            {
                return 1;
            }
            if(nums.length>2)
            {
                if(nums[2]==target)
                {
                    return 2;
                }
                if(nums[1]<nums[0] && nums[1]<nums[2])
                {valley=1;}
                
            }
            else
            {
                 return -1;
            }
           
        }
        
        
        
        for(int i=1;i<nums.length-1;i++){
            
            if(nums[i]<nums[i-1] && nums[i]<nums[i+1])
            {
                valley=i;
                break;
                
            }
            
        }
        
        if(valley!=-1)
        {for(int i=valley;i<(valley+nums.length);i++)
        {
            
            if(nums[i%(nums.length)]==target)
            {
                return (i%(nums.length));
            }
            
            
            
        }
        }
        else
        {
             
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]==target)
            {
                return i;
            }
            
        }
            
        }
        return -1;
        
        
        
        
    }
}