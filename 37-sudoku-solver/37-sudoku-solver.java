class Solution {
    
    
    public boolean solve(char[][]board)
    {
        
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]=='.')//first empty cell ,others will take care by recursion
                {
                    for(char ch='1';ch<='9';ch++)
                    {
                        if(isValid(board,ch,i,j))
                        {
                            
                            board[i][j]=ch;
                            
                            if(solve(board))return true;
                            
                            board[i][j]='.';//undo b/c this choice is not giving ans
                            
                        }
                    }
                    return false;
                    
                    
                    
                }
            }
            
        }
        return true;
        
    }
    
    
    public boolean isValid(char[][]board,int ch,int row,int col)
    {
        
        for(int i=0;i<9;i++)
        {
            
            if(board[row][i]==ch)return false;
            
            if(board[i][col]==ch)return false;
            
            if(board[3*(row/3)+(i/3)][3*(col/3)+(i%3)]==ch) return false;
            
            
        }
        return true;
        
        
        
    }
    
    
    public void solveSudoku(char[][] board) {
        solve(board);
    }
}