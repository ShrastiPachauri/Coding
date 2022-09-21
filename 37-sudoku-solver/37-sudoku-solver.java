class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    
public boolean solve(char[][] matrix) {
        
for(int i=0;i<matrix.length;i++)
{
for(int j=0;j<matrix[i].length;j++)
{

if(matrix[i][j]=='.')//empty cell
{
for(char val='1';val<='9';val++)
{
if(isfeasible(i,j,matrix,val)){
matrix[i][j]=val;
if(solve(matrix))return true;//tail recursion
else
{
    matrix[i][j]='.';
}
}

}

}
    if(matrix[i][j]=='.')return false;
}

}
return true;
}
public boolean isfeasible(int row,int col,char[][]matrix,char val)
{

for(int i=0;i<matrix.length;i++)
{
if(matrix[row][i]==val)return false;
if(matrix[i][col]==val)return false;
if(matrix[3*(row/3)+i/3][3*(col/3)+i%3]==val)return false;
}
    return true;
}



    }
