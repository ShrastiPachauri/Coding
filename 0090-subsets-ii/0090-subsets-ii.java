class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        int x=nums.length;// 
        int v=(int)Math.pow(2,x)-1;
        
        HashSet<List<Integer> >hs=new HashSet<List<Integer>>();
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        for(int i=0;i<=v;i++){
            ArrayList<Integer> a=new ArrayList<Integer>();
           
            for(int j=0;j<x;j++){
                 
                if((i & (1<<j))!=0){
                   
                    a.add(nums[nums.length-j-1]);
                }
            }
           Collections.sort(a);
            hs.add(a);
        }
        
        for(List<Integer> l:hs){
            ans.add(l);
        }
        
        
        
        return ans;
        
        
        
    }
}