class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length())return false;
        
        
        char[] s=new char[256];
        
        for(int i=0;i<s1.length();i++)
        {
            s[s1.charAt(i)]++;
        }        
    char[]window=new char[256];
       
        
        for(int i=0;i<s1.length();i++){
            window[s2.charAt(i)]++;
        }
        
            if(Arrays.equals(window,s)){
                return true;
            }
        for(int i=s1.length();i<s2.length();i++){
            
          window[s2.charAt(i-s1.length())]--;
            window[s2.charAt(i)]++;
            if(Arrays.equals(window,s)){
                return true;
            }
            
            
        }
        return false;
        
    }
}