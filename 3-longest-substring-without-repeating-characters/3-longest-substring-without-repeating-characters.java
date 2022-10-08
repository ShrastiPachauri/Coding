class Solution {
    public int lengthOfLongestSubstring(String s) {
        //abcda
        if(s.length()==1)return 1;
        HashMap<Character,Integer> hash=new HashMap<Character,Integer>();
        int length=0;
        int start=0;
        int end=0;
        for(int i=0;i<s.length();i++){
            if(!hash.containsKey(s.charAt(i))){
                hash.put(s.charAt(i),i);
               
                    end++;
            }
            else
            {
                if(end-start>length)length=end-start;
                int e=hash.get(s.charAt(i));
                for(int in=start;in<=e;in++){
                    if(hash.containsKey(s.charAt(in))){
                        hash.remove(s.charAt(in));
                    }
                }
                start=e+1;
                    end++;
                
                hash.put(s.charAt(i),i);//new recent index
                
            }
            
        }
        if(length<end-start)length=end-start;
        return length;
        
    }
}