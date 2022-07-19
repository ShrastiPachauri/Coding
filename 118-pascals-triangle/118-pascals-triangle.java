class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        
        List<Integer> l=new ArrayList<Integer>();
        l.add(1);
        ans.add(l);
        
        for(int i=0;i<numRows-1;i++)
        {
            List<Integer> x=new ArrayList<Integer>();
            
            
            for(int j=0;j<=ans.get(i).size();j++)
            {
                if(j==0 || j==ans.get(i).size())
                {x.add(1);}
                else
                {
                     x.add(ans.get(i).get(j-1)+ans.get(i).get(j));
                }
               
            }
            
            ans.add(x);
            
            
            
        }
       
        return ans;
        
        
        
        
        
    }
}