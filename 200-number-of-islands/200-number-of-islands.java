class Solution {
    public int numIslands(char[][] grid) {
        int cnt=0;
        
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                
                if(grid[i][j]=='1')
                {
                    visit(grid,i,j);
                    cnt++;
                }
                
            }
            
        }
        
        
        return cnt;
        
    }
    
    
    public void visit(char[][]grid,int i,int k)
    {
        if(i<0||i>=grid.length||k>=grid[0].length||k<0||grid[i][k]=='0')
        {
            return;
        }
        
        if(grid[i][k]=='1')
        { grid[i][k]='0';
            visit(grid,i-1,k);
            visit(grid,i+1,k);
            visit(grid,i,k+1);
            visit(grid,i,k-1);
           
        }
        
        
        
        
        
        
    }
}