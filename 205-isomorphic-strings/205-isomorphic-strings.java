class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        HashSet<Character> h=new HashSet<Character>();
        if(s.length()!=t.length())
        {
            return false;
        }
        
        int []hs=new int[257];
        for(int i=0;i<hs.length;i++)
        {
            hs[i]=-1;
        }
        
        
        for(int i=0;i<s.length();i++)
        {
            
            int x=s.charAt(i);
            
            if(hs[x]==-1  && !h.contains(t.charAt(i)))
            {
            hs[x]=t.charAt(i);
                h.add(t.charAt(i));
            
             }
        else
        {
            if(hs[x]!=(t.charAt(i)))
            {
                return false;
            }
        }
        
        
        
    }
        
        return true;
        
}
}