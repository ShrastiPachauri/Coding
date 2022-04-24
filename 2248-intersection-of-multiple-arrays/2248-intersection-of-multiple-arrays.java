class Solution {
    
    public List<Integer> intersection(int[][] nums) {
      
        List<Integer> ans=new ArrayList<Integer>();
        int arr[]=new int[1001];
       for(int []a:nums)
       {
           for(Integer x:a)
           {
               arr[x]++;
           }
       }

        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==nums.length)
            {
                ans.add(i);
            }
        }
        
        
    return ans;    
        
        
        
        
        
        
        
        
    }
}