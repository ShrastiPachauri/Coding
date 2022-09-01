class Solution {
    
    public String CountOcuurences(String s)
    {
       
        StringBuilder ans=new StringBuilder();
      
        char curr=s.charAt(0);
        int cnt=1;
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==curr)
            {
                cnt++;
            }
            else
            {
                ans.append(cnt+""+curr);
                curr=s.charAt(i);
                cnt=1;
            }
            
            
        }
        if(cnt>=1)
        {
            ans.append(cnt+""+curr);
        }
        
        return ans.toString();
        
    }
    
    public String countAndSay(int n) {
        
        String x=1+"";
        for(int i=2;i<=n;i++)
        {
            x=CountOcuurences(x);
        }
        return x;
    }
}