class Solution {
    public boolean isAnagram(String s, String t) {
        
        char []arr=s.toCharArray();
        char[]arr2=t.toCharArray();
        
        Arrays.sort(arr);
        Arrays.sort(arr2);
        
        
        if(String.valueOf(arr).equals(String.valueOf(arr2)))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}