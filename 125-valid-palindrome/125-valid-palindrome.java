class Solution {
    public boolean isPalindrome(String S) {
        
        String s=S.toLowerCase();
       
        StringBuilder sb=new StringBuilder(); 
        for(int i=0;i<s.length();i++)
        {
            
            if(s.charAt(i)>=97 && s.charAt(i)<=122)
            { 
                sb.append(""+s.charAt(i));
            }
            else if(s.charAt(i)>=48 && s.charAt(i)<=57)
            {
                sb.append(""+s.charAt(i));
            }
            else
            {
                continue;
            }
            
        }
        
        String result=sb.toString();
        if(result.length()<=1)
        {
            return true;
        }
        //System.out.println(" result is "+result);
        int j=result.length()-1;
        for(int i=0;i<=result.length()/2;i++,j--)
        {
            if(result.charAt(i)!=result.charAt(j))
            {
                return false;
            }
           
        }
        return true;
        
        
        
        
    }
}