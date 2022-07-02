class Solution {
    public String getHint(String secret, String guess) {
        int cntA=0;
        int cntB=0;
       
       
    char []s=secret.toCharArray();
               
int []a=new int[10];
        Arrays.fill(a,0);
        char[]g=guess.toCharArray();
        
        for(int i=0;i<s.length;i++)
        {
            a[ secret.charAt(i)-'0']++;
        }
        
        
        for(int i=0;i<guess.length();i++)
        {
            
        if(s[i]==g[i])
        {
            cntA++;
          
            a[g[i]-'0']--;
            
        }
        
          else
          {
              continue;
          }
            
            
            
        }
        
        for(int i=0;i<guess.length();i++)
        {
            
        if(s[i]!=g[i] && a[g[i]-'0']>=1)
        {
            cntB++;
          
            a[g[i]-'0']--;
            
        }
         
        }
        
        
       
        
        
        
        
        
        
        
        
        
        
        
        return (cntA+"A"+cntB+"B");
        
        
        
        
        
        
    }
}