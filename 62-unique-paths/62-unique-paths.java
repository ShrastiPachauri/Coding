class Solution {
    
    int[][]dp;

public int possiblepath(int m,int n,int i,int j,int[][]dp){

if(dp[i][j]!=-1)return dp[i][j];
if(i==m-1 && j==n-1){
return 1;
}
int x=0,y=0;
if(i<m-1){
 x=possiblepath(m,n,i+1,j,dp);}

if(j<n-1){
 y=possiblepath(m,n,i,j+1,dp);
}

dp[i][j]= x+y;
return dp[i][j];


}


    public int uniquePaths(int m, int n) {
      dp=new int[m+1][n+1];
for(int i=0;i<=m;i++)
{
Arrays.fill(dp[i],-1);
}
return possiblepath(m,n,0,0,dp);



    }
}