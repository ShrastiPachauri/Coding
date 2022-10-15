class Solution {
    
    public void swap(List<Integer> nums,int i,int j){
        int temporary=nums.get(i);
        nums.set(i,nums.get(j));
        nums.set(j,temporary);
    }
    
    
    
    
    public void findpermutation(List<Integer> nums,int start,HashSet<List<Integer>> hash){
        
        for(int i=start;i<nums.size();i++){
            
            swap(nums,start,i);
           
            findpermutation(nums,start+1,hash);
           
             swap(nums,start,i);
        }
        //completed one path,before returning
        List<Integer> t=new ArrayList<Integer>(nums);
        hash.add(t);
        
        
    }
    
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> list=new ArrayList<Integer>();
        for(int x:nums){
            list.add(x);
        }
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        HashSet<List<Integer>> hs=new HashSet<List<Integer>>();
        findpermutation(list,0,hs);
        for(List<Integer> l:hs){
            ans.add(l);
        }
        return ans;
        
    }
}