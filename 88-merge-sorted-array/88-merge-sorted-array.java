class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        if(nums1.length==0|| nums2.length==0)
        {
            return;
        }
        int j=0;
        int i=0;
        for(i=0;i<m;i++)
        {
            if(nums1[i]>nums2[j])
            {
                int temp=nums1[i];
                nums1[i]=nums2[j];
                nums2[j]=temp;
                Arrays.sort(nums2);
                
            }
        }
        Arrays.sort(nums2);
        for(int k=i;k<nums1.length;k++)
        {
            
            nums1[k]=nums2[j];
            
            j++;
        }
        
        
        
        
        
    }
}