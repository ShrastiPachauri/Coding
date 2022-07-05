class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hs=new HashSet<Integer>();
         int x=0;
        int N=n;
       
       while(x!=1) 
       {
           x=0;
       while(N>0)
       {
           x+=(N%10)*(N%10);
           N=N/10;
           
       }
           
          
           N=x;
           if(hs.contains(x))
           {
               return false;
           }
           else
           {
               hs.add(x);
           }
       }
        
        return true;
        
        
        
        
    }
}