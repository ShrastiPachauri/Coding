class Solution {
    ArrayList<List<Integer>> ans;
    
    
    
    public List<List<Integer>> subsets(int[] nums) {
        
       ans=new ArrayList<List<Integer>>();
        func(0,nums,new ArrayList<Integer>());
        return ans;
    }
    public void func(int index ,int []nums,List<Integer> l)
    {
        if(nums.length==index)
        {
            //remember to crete copy of list b/c on backtracking it will be rewrittrn to the the element
            List<Integer> a=new ArrayList<Integer>(l);
            ans.add(a);
            return;
            
        }
        List<Integer> a=new ArrayList<Integer>(l);
        
        //not pick
        func(index+1,nums,a);
        
        //pick
        a.add(nums[index]);
            func(index+1,nums,a);
        
    }
    
}