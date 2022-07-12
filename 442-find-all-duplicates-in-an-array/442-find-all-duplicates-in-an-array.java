class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        int[]ans=new int[nums.length+1];
        List<Integer> A=new ArrayList<Integer>();
        
        for(int x:nums)
        {
            if(ans[x]!=0)
            {
                A.add(x);
            }
            else
            {
                ans[x]++;
            }
        }
        return A;
    }
}