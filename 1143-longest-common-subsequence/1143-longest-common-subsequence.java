class Solution {
    
    int dp[][];
    public int lcs(String s1,String s2,int size1,int size2){
       
        for(int i=0;i<=size2;i++){
            dp[i][0]=0;
        }
         for(int i=0;i<=size1;i++){
            dp[0][i]=0;
        }
        
        
        for(int i=1;i<=size2;i++){
            for(int j=1;j<=size1;j++){
        
        if(s1.charAt(j-1)==s2.charAt(i-1)){
            dp[i][j]= 1+dp[i-1][j-1];
        }
        else
        {
            dp[i][j]= (int)Math.max(dp[i-1][j],dp[i][j-1]);
            
        }
            }
        }
        return dp[size2][size1];
    }
    
    public int longestCommonSubsequence(String text1, String text2) {
        
        dp=new int[text2.length()+1][text1.length()+1];
        return lcs(text1,text2,text1.length(),text2.length());
        
        
        
        
        
    }
}