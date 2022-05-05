class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        
  int l=0;
        int h=arr.length-1;
        int mid=l+(h-l)/2;
        while(h-l>=1)
        {
            mid=l+(h-l)/2;
            
            if(arr[mid]>arr[mid+1] &&arr[mid]>arr[mid-1] )
            {
                return mid;
            }
            else if(arr[mid]<arr[mid+1])
            {
                l=mid;
            }
            else
            {
                h=mid;
            }
            
            
            
        }
        return -1;
    }
}