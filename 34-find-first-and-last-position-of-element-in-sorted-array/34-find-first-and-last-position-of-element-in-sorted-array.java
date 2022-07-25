class Solution {
    
    
    int f(int []arr,int low,int high,int target)
    {
        
        if(low<0 ||high>=arr.length)
        {
            return -1;
        }
        
        
        
        int mid=low+(high-low)/2;
        
        
        while(low<=high)
        {
            mid=low+(high-low)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[mid]<target)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        
        return -1;
        
        
    }
    
    
    
    
    
    
    
    
    
    public int[] searchRange(int[] nums, int target) {
        
        
        
       int index= f(nums,0,nums.length-1,target);
        int start=index,end=index;
     
        System.out.println("index is "+start);
        //first
        
        while(true)
        {
            int x=f(nums,0,start-1,target);
            
            if(x==-1)
            {
                break;
            }
            else
            {
                start=x;
                System.out.println("start is "+start);
            }
        }
        
        
        
        
        //last
        
        while(true)
        {
            int x=f(nums,end+1,nums.length-1,target);
            
            if(x==-1)
            {
                break;
            }
            else
            {
                end=x;
                System.out.println("end is "+end);
            }
        }
        
        
        
        int[]ans=new int[2];
        ans[0]=start;
        ans[1]=end;
        
        return ans;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}