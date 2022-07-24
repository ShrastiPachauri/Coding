class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        HashSet<List<Integer>> hl=new HashSet<List<Integer>>();
        if(nums.length<4)
        {
            return ans;
        }
       
        for(int i=0;i<nums.length-3;i++)
        {
        
        for(int j=i+1;j<nums.length-2;j++)
        {
           
            
            long v=nums[i]+nums[j];
          for(int k=j+1,l=nums.length-1;k<l;)
        { 
           
              
             if((long)nums[k]+(long)nums[l]==((long)target-v))
              {
                  List<Integer> L=new ArrayList<Integer>();
                 L.add(nums[i]);
                 L.add(nums[j]);
                 L.add(nums[k]);
               L.add(nums[l]);
                  
               if(!hl.contains(L))
               {ans.add(L);
               hl.add(L);
               }
                k++;
              }
              else if((long)nums[k]+(long)nums[l]<((long)target-v))
              { 
                  k++;
              } 
               else
               {
                   l--;
               }
              
           
          
            
        }
           
        
    }
            
}
        
        return ans;
    }
}