class Solution {
    
    
    public int Count(String s,int low,int high)
    {
        
        for(int i=low;i<=high;i++)
        {
            if(s.lastIndexOf(s.charAt(i))>high)
            {
                high=s.lastIndexOf(s.charAt(i));
            }
        }
       return high;
    }
    
    
    
    
    
    
    
    public List<Integer> partitionLabels(String s) {
        
        List<Integer> l=new ArrayList<Integer>();
        
        for(int i=0;i<s.length();)
        {
        int low=s.indexOf(s.charAt(i));
          int  high=s.lastIndexOf(s.charAt(i));
        
            int nlow=Count(s,low,high);
            l.add(nlow-low+1);
            i=nlow+1;
        }
        
        return l;
        
        
        
        
        
    }
}