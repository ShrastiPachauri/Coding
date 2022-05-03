class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashMap<Integer,Integer>hs=new HashMap<Integer,Integer>();
        
        for(Integer x:nums)
        {
            if(!hs.containsKey(x) )   
            {
                hs.put(x,1);
            }
            else
            {
                return true;
            }
            
            
            
            
        }
        
        return false;
        
        
        
        
        
        
        
        
        
        
    }
}