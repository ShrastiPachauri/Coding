class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length())return false;
        
        char[]st1=s1.toCharArray();
        Arrays.sort(st1);
        int last=s2.length()-s1.length();
        
        String sub=s2.substring(0,s1.length());//first window substring
         char[]arr=sub.toCharArray();
            Arrays.sort(arr);
            if(Arrays.equals(st1,arr)){
                return true;
            }
        for(int i=s1.length();i<s2.length();i++){
            
           sub=sub.substring(1,sub.length())+s2.charAt(i);
            arr=sub.toCharArray();
            Arrays.sort(arr);
            if(Arrays.equals(st1,arr)){
                return true;
            }
            
        }
        return false;
        
    }
}