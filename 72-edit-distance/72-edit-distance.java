class Solution {
    
    int dp[][];
    
    public int op(String t1,String t2,int i,int j){
        
        for(int c=0;c<=t2.length();c++){
            dp[0][c]=c;
        }
        for(int r=0;r<=t1.length();r++){
            dp[r][0]=r;
        }
       
        
      for(int r=1;r<=i;r++)
      {
        for(int c=1;c<=j;c++){
          
        if(t1.charAt(r-1)==t2.charAt(c-1)){
            dp[r][c]=dp[r-1][c-1];
        }
       else
       {
        dp[r][c]= 1+(int)Math.min(dp[r-1][c-1],(int)Math.min(dp[r-1][c], dp[r][c-1]));
          
       }
        
    } 
    }
       return dp[i][j]; 
        
    }
    
    
    
    public int minDistance(String word1, String word2) {
    dp=new int[word1.length()+1][word2.length()+1];
        for(int[] x:dp){
            Arrays.fill(x,0);
        }
        return op(word1,word2,word1.length(),word2.length());
    }
}