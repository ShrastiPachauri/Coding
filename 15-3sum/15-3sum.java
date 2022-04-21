class Solution {
    
     Map<String,Integer> m=new HashMap<String,Integer>();

    
    
    public List<List<Integer>> threeSum(int[] nums) {
       
        
        
        Arrays.sort(nums);
        //HashSet<List<Integer>> hs=new HashSet<List<Integer>>();
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        
        
      
        
        
        for(int i=0;i<nums.length-1;i++)
        {
           int start=i+1,end=nums.length-1;
            int req=0-(nums[i]);
            while(start<end)
            {
                
                 if((nums[start]+nums[end])==req)
                 {
                     String x=nums[i]+","+nums[start]+","+nums[end];
                     
                     if(!m.containsKey(x))
                     {m.put(x,1);
                      ans.add(Arrays.asList(new Integer[]{nums[i],nums[start],nums[end]}));
                     }
                    
                     
                     
                 }
                
                
                
                
                if((nums[start]+nums[end])>req)
                {
                    end--;
                }
                else
                {
                    start++;
                }
                
                
            }
            
            
            
        }
        
        
        return ans;
        
        
    }
}