class Solution {
    public int reverse(int x) {
        
        
        
        
        
        boolean negative=false;
        long reverse=0;
        if(x<0)
        {
            negative=true;
            x=x*-1;
        }
        while(x>0)
        {
            reverse=reverse*10+(x%10);
            x=x/10;
          
        }
        if(reverse>Integer.MAX_VALUE)
        {
            return 0;
        }
        return (int)(negative?(-1*reverse):reverse);
        
        
    }
}