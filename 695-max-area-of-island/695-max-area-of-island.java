class Solution {
    
    public void area(int[][]grid,int[]ans,int row,int col){
        
        
        if(row>=grid.length||row<0||col>=grid[0].length||col<0||grid[row][col]==0)return;
        
        if(grid[row][col]==1){
            ans[0]++;
            grid[row][col]=0;
            
            area(grid,ans,row-1,col);
            area(grid,ans,row+1,col);
            area(grid,ans,row,col-1);
            area(grid,ans,row,col+1);
           
        }
        
        
    }
    
    
    
    
    
    
    public int maxAreaOfIsland(int[][] grid) {
        int max_area=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1){
                    int[]ans=new int[1];
                    area(grid,ans,i,j);
                    if(ans[0]>max_area)max_area=ans[0];
                }
            }
            
        }
        return max_area;
    }
}