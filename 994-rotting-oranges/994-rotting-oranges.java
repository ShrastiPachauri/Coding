class Solution {
    
    class Orange
    {
        int row;
        int col;
        Orange(int row,int col){
            this.row=row;
            this.col=col;
        }
    }
    
    
    
    
    
    public int orangesRotting(int[][] grid) {
        
        int total_oranges=0;
        int time=0;
        
        Deque<Orange> dq=new ArrayDeque<Orange>();
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]!=0){
                    total_oranges++;
                    if(grid[i][j]==2){
                        dq.addLast(new Orange(i,j));//rotten oranges added
                    }
                }
            }
            
        }
        int rotten_oranges=0;
        
        while(!dq.isEmpty()){
            
            int s=dq.size();
            boolean rot=false;
            for(int i=0;i<s;i++){
                
                Orange o=dq.poll();
                rotten_oranges++;
                int r=o.row;
                int c=o.col;
                
                
                    if( r>=1 && grid[r-1][c]==1)
                    {grid[r-1][c]=2;
                     rot=true;
                        dq.addLast(new Orange(r-1,c));
                    
                    }
                    
                    if(r+1<=grid.length-1 && grid[r+1][c]==1){
                        grid[r+1][c]=2;
                         rot=true;
                    dq.addLast(new Orange(r+1,c));
                    }
                    
                
               if(c>=1 && grid[r][c-1]==1){
                   grid[r][c-1]=2;
                    rot=true;
                   dq.addLast(new Orange(r,c-1));
               }
                if(c+1<=grid[0].length-1 && grid[r][c+1]==1) {
                    grid[r][c+1]=2;
                     rot=true;
                    dq.addLast(new Orange(r,c+1));
                    
                    
                }   
            }
                
            
            //completed one instant of time
            if(rot)time++;//impb/c last level pr ek bhi rot nhi hoga toh usko nhi count karna
            
            
            
            
        }
        //System.out.println("rotten oranges"+rotten_oranges);
        if(rotten_oranges!=total_oranges)return -1;
        return time;
        
        
    }
}