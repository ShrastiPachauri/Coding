class Solution {
    
    
    public boolean check(int n,int div)
    {
       if(n==1)
       {
          return true; 
       }
        if((n%div)==0)
        {
             return check(n/3,div);
        }
       return false;
        
        
        
        
        
    }
    
  
    public boolean isPowerOfThree(int n) {
        if(n==0)
        {
            return false;
        }
        return check(n,3);
        
        
        
        
        
    }
}