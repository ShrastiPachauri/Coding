class Solution {
    
    
    public int findKth(int[]nums,int k,int start,int end,int pivot){
        if(start>end)return -1;
        int hi=-1;
        int l=start-1;
        for(int i=start;i<=end;i++)
            {
                if(nums[i]<=pivot){
                    if(hi!=-1){
                        int temp=nums[hi];
                        nums[hi]=nums[i];
                        nums[i]=temp;
                        hi++;
                    }
                    
                    l++;//found lower value at this index 
                    
                   
                }
                else{
                    if(hi==-1)hi=i;
                }
                
            }         
           
            if(l==nums.length-k)return nums[l];
            else if(l<(nums.length-k)){return findKth(nums,k,l+1,nums.length-1,nums[end]);
            }
            else{return findKth(nums,k,0,l-1,nums[l-1]);
            }
      
    }
   
    public int findKthLargest(int[] nums, int k) {
        //kth largeest element would come at n-k,n is num of elemnts index
        
        
       
       return findKth(nums,k,0,nums.length-1,nums[nums.length-1]);
           
           
            
}
}
