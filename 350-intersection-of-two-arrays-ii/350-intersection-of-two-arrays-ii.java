class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> ans=new ArrayList<Integer>();
        int j=0;
        for(int i=0;i<nums1.length && j<nums2.length;)
        {
            
           if(nums2[j]==nums1[i])
           {
               ans.add(nums2[j]);
               i++;
               j++;
           }
            else if(nums1[i]<nums2[j])
            {
                i++;
            }
            else
            {
                j++;
            }
            
            
            
        }
        
        int[] answer=new int[ans.size()];
        int i=0;
        for(int x:ans)
        {
            answer[i++]=x;
            
           
        }
        
        
        return answer;
        
        
        
        
        
        
        
    }
}