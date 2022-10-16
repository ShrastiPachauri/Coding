class Solution {
    public int bsearch(int[]nums,int low,int high){
        if(high-low<2)return -1;
        int l=low;
        int h=high;
        int mid=l+(h-l)/2;
        
        
        while(h-l>2){
            mid=l+(h-l)/2;
            
            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]){
                return nums[mid];
            }
            else {
                int x=0,y=0;
                if(nums[mid]==nums[mid+1]){
                    x=bsearch(nums,low,mid-1);
                      y=bsearch(nums,mid,high);
                }
                else{
                      x=bsearch(nums,low,mid);
                    y=bsearch(nums,mid+1,high);
                }
               
                if(x==-1 && y==-1)return -1;
                else if(x==-1)return y;
                else return x;
                
            }
            
            
            
            
        }
       if(nums[mid]==nums[h])return nums[l];
            else return nums[h];
         
    }
    public int singleNonDuplicate(int[] nums) {
        
        if(nums.length==1)return nums[0];
    //at nums.lengthn2?
       //atleast 3 elemnets
        
     return bsearch(nums,0,nums.length-1);
        
        
        
        
    }
}