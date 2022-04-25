class Solution {
    public boolean checkString(String s) {
        
        String temp=s;
        char[]A=s.toCharArray();
        Arrays.sort(A);
        
        if(A[0]==A[A.length-1])
        {
            return true;
        }
        
        
        
        
        if(s.lastIndexOf('a')>s.indexOf('b'))
        {
            return false;
        }
        return true;
    }
}