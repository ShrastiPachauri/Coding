class Solution {
    public int strStr(String haystack, String needle) {
        
        int index=-1;
        int in=0;
        for(int i=0;i<=haystack.length()-needle.length();i++)
        {
           for(int j=i;j<i+needle.length();j++)
           {
               if(haystack.charAt(j)==needle.charAt(in))
               {
                   in++;
               }
               else
               {
                   break;
               }
           }
            if(in==needle.length())
            {
                return i;
            }
            in=0;
        }
        return -1;
    }
}