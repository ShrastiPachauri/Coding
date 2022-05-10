class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int i=0,j=0;
        if(n==0)
        {
            return ;
        }
        for(i=0;i<m;)
        {
            
            if(nums1[i]>nums2[j])
            {
          for(int k=m;k>i;k--)
          {
                nums1[k]=nums1[k-1];
             
            }
                m++;
                nums1[i]=nums2[j];
                j++;
                if(j==n)
                {
                    break;
                    
                }
                i++;
          
        }
          else  
            i++;
            
        
    }
        
        if(j!=n)
        {
            
            for(int in=m;j<nums2.length;in++)
        {
            
            nums1[in]=nums2[j++];
            
            
            
        }
}
    }
}