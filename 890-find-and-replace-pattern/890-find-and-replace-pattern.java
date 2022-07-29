class Solution {
    
    
    
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        
        List<List<Integer>> l=new ArrayList<List<Integer>>();
        List<String> ans=new ArrayList<String>();
        for(int i=0;i<pattern.length();i++)
        {
            List<Integer> o=new ArrayList<Integer>();
            char x=pattern.charAt(i);
            for(int j=0;j<pattern.length();j++)
            {
                if(pattern.charAt(j)==x)
                {
                    o.add(j);
                }
                
            }
            l.add(o);
        }
        
        
        
         for(int i=0;i<words.length;i++)
        {
             List<List<Integer>> L=new ArrayList<List<Integer>>();
          for(int j=0;j<words[i].length();j++)
        {
            List<Integer> o=new ArrayList<Integer>();
            char x=words[i].charAt(j);
            for(int k=0;k<words[i].length();k++)
            {
                if(words[i].charAt(k)==x)
                {
                    o.add(k);
                }
                
            }
            L.add(o);
        }
        if(L.equals(l)==true)
        {
            ans.add(words[i]);
        }
         }
       return ans;
    }
}