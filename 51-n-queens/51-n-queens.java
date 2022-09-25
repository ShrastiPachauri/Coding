class Solution {
    
    
    public void solve(char[][]board,int col,ArrayList<List<String>>solution){
        if(col==board.length){
            System.out.println("board constructed");
            List<String> currentBoard=new ArrayList<String>();
           for(int i=0;i<board.length;i++)
               {
                  StringBuilder s=new StringBuilder();
                 for(int j=0;j<board.length;j++)  
                 {
                     s.append(board[i][j]);
                 }
                   
                   currentBoard.add(s.toString());
               }
            solution.add(currentBoard);
          return;
        }
        for(int row=0;row<board.length;row++){
           
           if(canPlace(board,col,row)){
               
               board[row][col]='Q';
              solve(board,col+1,solution);
               board[row][col]='.';
           }
            
        }
         
        
        
    }
    
    public boolean canPlace(char[][]board,int col,int row){
        
        int r=row;
        int c=col;
      
        while(c>=0 && board[row][c]!='Q')c--;
        if(c>=0)return false;
          
        c=col;
        r=row;
         while(r>=0 && board[r][c]!='Q')r--;
        if(r>=0)return false;
        
        
        c=col;
        r=row;
        

         while(r<board.length && c>=0 && board[r][c]!='Q'){
             r++;
             c--;
             
         }
            if(r<board.length && c>=0 )return false;
          
        
        c=col;
        r=row;
         while(r>=0 && c>=0 && board[r][c]!='Q'){
            r--;
             c--;
        }
        if(r>=0 && c>=0)return false;
        
        return true;
        
        
    }
    
    
    
    public ArrayList<List<String>> solveNQueens(int n) {
        
        char[][]board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        ArrayList<List<String>> solution=new ArrayList<List<String>>();
        solve(board,0,solution);
        return solution;
        
    }
}