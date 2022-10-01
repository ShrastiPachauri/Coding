class Solution {
    public int numIslands(char[][] grid) {
        int cnt=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                
                if(grid[i][j]=='1'){
                    trackLand(grid,i,j);
                    cnt++;
                }
            }
        }
        return cnt;
    }
        
        public void trackLand(char[][]grid,int r,int c){
            
            if(r<0||c<0||r>=grid.length||c>=grid[0].length)return;
            
            if(grid[r][c]=='1'){
                grid[r][c]='0';
            trackLand(grid,r+1,c);
            trackLand(grid,r,c+1);
            trackLand(grid,r-1,c);
            trackLand(grid, r,c-1);
            }
            }
        
        
        
        
    }
