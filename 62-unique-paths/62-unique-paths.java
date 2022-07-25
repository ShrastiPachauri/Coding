class Solution {
    int [][]matrix;
    public int f(int d,int r)
    { 
      
        if(d==0 && r==0)
        {
            return 1;
        }
        if(matrix[d][r]!=-1)
        {
            return matrix[d][r];
        }
        int c1=0,c2=0;
        if(d>0)
        {c1=f(d-1,r);}
        if(r>0)
        {c2=f(d,r-1);}
        matrix[d][r]=c1+c2;
        return c1+c2;
        
        
        
        
        
    }
    
    
    
    
    public int uniquePaths(int m, int n) {
       
       matrix=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                matrix[i][j]=-1;
            }
        }
        return f(m-1,n-1);
    }
}