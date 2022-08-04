class Solution {
    HashSet<List<Integer>> hs;
    
    
    public void f(int[]candidate,int target,int index,int sum,List<Integer> comb)
    {
       
        
        
        if(sum==target)
        {
            List<Integer> a=new ArrayList<Integer>(comb);
            hs.add(a);
            return;
        }if(index==candidate.length||sum>target)
        {
            return;
        }
        
        comb.add(candidate[index]);
        f(candidate,target,index,sum+candidate[index],comb);
        comb.remove(comb.size()-1);
        f(candidate,target,index+1,sum,comb);
        
        return;
    }
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        hs=new HashSet<List<Integer>>();
        List<Integer> comb=new ArrayList<Integer>();
        f(candidates,target,0,0,comb);
        List<List<Integer>> ans=new ArrayList(hs);
        
        return ans;
        
        
    }
}