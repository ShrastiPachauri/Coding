class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        
        HashSet<Character>hs=new HashSet<Character>();
        int max=0;
        int cnt=0;
        for(int i=0;i<s.length();i++)
        {
          for(int j=i;j<s.length();j++)
            {
                
                 if(hs.contains(s.charAt(j)))
                 {
                     hs.clear();
                     cnt=0;
                     break;
                 }
                else
                {
                    hs.add(s.charAt(j));
                    cnt++;
                    
                    max=cnt>max?cnt:max;
                }
                
            }
        }
        
        return max;
    }
}