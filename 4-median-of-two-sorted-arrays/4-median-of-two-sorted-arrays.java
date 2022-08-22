class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int[]ans =new int[nums1.length+nums2.length];
       int i=0;
        int j=0;
        int k=0;
        
        for(;i<nums1.length && j<nums2.length;)
        {
            if(nums1[i]<=nums2[j])
            {
                ans[k]=nums1[i];
                i++;
                k++;
                
            }
            else if(nums1[i]>=nums2[j])
            {
                ans[k]=nums2[j];
                j++;
                k++;
                
            }
            
            
            
            
        }
        
        if(i<nums1.length)
        {
            
            for(int index=i;index<nums1.length;index++)
            {
                ans[k]=nums1[index];
                k++;
            }
            
            
            
        }
        if(j<nums2.length)
        {
            
            for(int index=j;index<nums2.length;index++)
            {
                ans[k]=nums2[index];
                k++;
            }
            
            
            
        }
        
     for(int I=0;I<ans.length;I++)
     {
         System.out.println(ans[I]);
     }
        
       if(ans.length%2==0)
       { 
        
        System.out.println(ans[1]);
           return (ans[ans.length/2]+ans[(ans.length/2)-1])/2.0;
        
       }
        
        return ans[ans.length/2]/1.0;
    }
}