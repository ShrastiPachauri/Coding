class Solution {
   
    public int func(int n ,int[]remember)
    {
        if(n==0)
        {
            return 1;
        }
        if(n<0)
        {
            return 0;
        }
        //System.out.println("n is "+n);
        if( remember[n]!=0)
        {
            return remember[n];
        }
        
           int x= func(n-1 ,remember)+func(n-2 ,remember);
        remember[n]=x;
        
        
        return x;
        
        
    }
    public int climbStairs(int n) {
        
         int[]remember=new int[n+1];
        return func(n,remember);
        
    }
}