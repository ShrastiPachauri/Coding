class Solution {
    
    
   long dp[][];
    public double findMinPath(int[][]grid,int row,int col)
    {
        if(row==grid.length-1 && col==grid[0].length-1)return grid[row][col];
       if(row>=grid.length)return Integer.MAX_VALUE;
       if(col>=grid[0].length)return Integer.MAX_VALUE;
        if(dp[row][col]!=-1)return dp[row][col];
        
       return dp[row][col]=grid[row][col]+(int)Math.min( findMinPath(grid,row+1,col),findMinPath(grid,row,col+1));
          
    
        
    }
    
    
    
    
    
    
    
    public int minPathSum(int[][] grid) {
        dp=new long[grid.length+1][grid[0].length+1];
        for(long[]x:dp){
            Arrays.fill(x,-1);
        }
        return (int)findMinPath(grid,0,0);
    }
}