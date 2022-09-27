class Solution {
    //abcde
    //ace
    
    int[][]dp;
    public int lcs(String text1,String text2,int[][]dp,int i,int j){
        
        if(i==text1.length()||j==text2.length())return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        int p=0,np1=0,np2=0;
        if(text1.charAt(i)==text2.charAt(j)){
           p=1+lcs(text1,text2,dp,i+1,j+1);
        }
        else
        {
            
          np1= lcs(text1,text2,dp,i,j+1);
            
            np2= lcs(text1,text2,dp,i+1,j);
            
            
        }
        dp[i][j]= (int)Math.max(p,(int)Math.max(np1,np2));
        return dp[i][j];
    }
    
    public int longestCommonSubsequence(String text1, String text2) {
        
       int[][]dp=new int[text1.length()+1][text2.length()+1];
        for(int[]x:dp){
            Arrays.fill(x,-1);
        }
         return lcs(text1,text2,dp,0,0);
        
    }
}