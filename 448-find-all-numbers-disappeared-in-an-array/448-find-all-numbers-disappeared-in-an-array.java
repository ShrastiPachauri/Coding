class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        HashSet<Integer> hs=new HashSet<Integer>();
        
        
        for(int x:nums)
        {
            hs.add(x);
        }
        
        List<Integer> ans=new ArrayList<Integer>();
        for(int i=1;i<=nums.length;i++)
        {
            if(!hs.contains(i))
            {
                ans.add(i);
            }
        }
        
        return ans;
        
        
        
    }
}