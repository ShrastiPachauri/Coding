class Solution {
    public boolean canPlaceFlowers(int[] nums, int n) {
        
        //basically we have to find vaccant plots but not adjacent
       int cnt=0;
        if(n==0)
        {
            return true;
        }
        if(nums.length==1 )
        {
            if(nums[0]==0 && n==1)
            {
                return true;
            }
           return false;
           
        }
        if(nums.length==2)
        {
            if(nums[0]==1 ||nums[1]==1)
            {
                return false;
            }
            else if(n<=1 )
            {
             return true;
            }
            return false;
        }
        
        
        if(nums.length==3)
        {
            if(nums[1]==1)
            {
                return false;
            }
            if(nums[0]==0 )
            {
                nums[0]=1;
                cnt++;
                
            
        }
            if(nums[2]==0)
            {
                nums[2]=1;
                cnt++;
            }
            if(n<=cnt)
            {
                return true;
            }
            return false;
        }
        
        
        
        
        if(nums[0]==0 && nums[1]==0)
        {
            nums[0]=1;
            cnt++;
        }
        
        
       
        for(int i=1;i<nums.length-1;i++)
        {
            if((nums[i+1]==0 && nums[i]==0 )&& nums[i-1]==0)
            {
               nums[i]=1;
                cnt++;
               
                
            }
        }
         if(nums[nums.length-1]==0 && nums[nums.length-2]==0)
        {
             nums[nums.length-1]=1;
            cnt++;
        }
        if(cnt>=n)
        {
            return true;
        }
        
        
        return false;
        
        
        }
        
        
        }
        
    
