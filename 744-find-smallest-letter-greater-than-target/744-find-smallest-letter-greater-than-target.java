class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
       
        
        
        int low=0;
        int high=letters.length-1;
        int mid=low+(high-low)/2;
        int min='z';
        int flg=0;
   int t=target%min;
        if(t==0)
        {
            return letters[0];
        }
      
        while(low<=high)
        {
            mid=low+(high-low)/2;
            int lmid=letters[mid];
            if(lmid>target && lmid<=min)
            {
                flg=1;
                min= letters[mid];
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        if(flg==0)
        {
            return letters[0];
        }
       
        char ans=(char)min;
        return ans;
    }
}