class Solution {
    public int majorityElement(int[] nums) {
        double limit=nums.length/2.0;
        
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
           
        }
        
        for(Map.Entry<Integer,Integer> x:hm.entrySet())
        {
            
            if(x.getValue()>limit)
            {
                return x.getKey();
            }
            
            
        }
        return -1;
        
    }
}