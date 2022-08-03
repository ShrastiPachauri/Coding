class Solution {
    
    HashSet<List<Integer>> ans;
    
    
    public void f(int[]nums,int index)
    {
        
        if(index==nums.length)
        { List<Integer> l=new ArrayList<Integer>();
        
            for (int i = 0; i < nums.length; i++) {
                l.add(nums[i]);
            }
            ans.add(l);
            return;
          
        }
        
        for(int i=index;i<nums.length;i++)
        {
            int temp=nums[index];
            nums[index]=nums[i];
            nums[i]=temp;
                
                f(nums,index+1);
            int t=nums[index];//back to original configuration
            nums[index]=nums[i];
            nums[i]=t;
            
        }
       
    }
    
    public List<List<Integer>> permute(int[] nums) {
        
        ans=new HashSet<List<Integer>>();
        f(nums,0);
        List<List<Integer>> answer=new ArrayList<List<Integer>>();
        
        for(List<Integer> x:ans)
        {
            answer.add(x);
            
        }
        return answer;
        
    }
}