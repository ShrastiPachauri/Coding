class Solution {
    
    
    public void findCombinations(int[]candidates,int target,int index,int sum,List<List<Integer>> ans,ArrayList<Integer>temp ){
        
        if(sum==target){
            
            ArrayList<Integer> list=new ArrayList<Integer>();
            list.addAll(temp);
            ans.add(list);
            return ;
            
        }
        if(index>=candidates.length ||sum>target){
            return;
        }
         
        
        //take
        temp.add(candidates[index]);
        
        findCombinations(candidates,target,index,sum+candidates[index],ans,temp);
        temp.remove(temp.size()-1);
        findCombinations(candidates,target,index+1,sum,ans,temp);
        
        
        
    }
    
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        
        
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        findCombinations(candidates,target,0,0,ans,new ArrayList<Integer>());
        
        return ans;
        
        
    }
}