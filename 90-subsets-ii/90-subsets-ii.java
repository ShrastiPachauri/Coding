class Solution {
    
    HashSet<List<Integer>> ans;
    public void f(int[]nums,int i,List<Integer> a)
    {
        
        if(i==nums.length)
        {
            // System.out.println("base condition");
            // System.out.println("a size "+a.size());
            List<Integer> l=new ArrayList(a);
            ans.add(l);
            return;
        }
        
        
        
        a.add(nums[i]);
        
        f(nums,i+1,a);
        a.remove(a.size()-1);
        f(nums,i+1,a);
        
        
        
    }
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        ans=new HashSet<List<Integer>>();
        f(nums,0,new ArrayList<Integer>());
        // System.out.println("size of ans "+ans.size());
        List<List<Integer>> l=new ArrayList<List<Integer>>();
        
        for(List<Integer> x:ans)
        {
            l.add(x);
        }
        
        
        return l;
        
        
    }
      
    }
        
    
