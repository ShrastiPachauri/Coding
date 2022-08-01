class Solution {
    
    int[][]dp;

    public int f(int m,int n,int i,int j)
    {
        if(i+j==(m+n-2))
        {
            return 1;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        
       int x=0;
        int y=0;
        
        if(i<m-1)
        {x=f(m,n,i+1,j);}
        
       if(j<n-1)
       {y=f(m,n,i,j+1);}
        
       
    dp[i][j]=x+y;
    
        
        return dp[i][j];
        
        
        
    }
    
    public int uniquePaths(int m, int n) {
        
        dp=new int[m+1][n+1];
        
        for(int i=0;i<=m;i++)
        {
            for(int j=0;j<=n;j++)
            {
                dp[i][j]=-1;
            }
        }
        int res=f(m,n,0,0);
        return res;
    }
}