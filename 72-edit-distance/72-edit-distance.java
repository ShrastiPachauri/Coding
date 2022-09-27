class Solution {
    
    int dp[][];
    
    public int op(String t1,String t2,int i,int j){
        
        
        if(i<0){
            return j+1;
        }
        if(j<0){
            return i+1;
        }
        
        if(dp[i][j]!=-1)return dp[i][j];
        
        if(t1.charAt(i)==t2.charAt(j)){
            return 0+op(t1,t2,i-1,j-1);
        }
       else
       {
        int re=1+op(t1,t2,i-1,j-1);
        int del=1+op(t1,t2,i-1,j);
        int ins=1+op(t1,t2,i,j-1);
        
        dp[i][j]= (int)Math.min(re,(int)Math.min(del,ins));
           return dp[i][j];
       }
    }
    
    
    
    
    
    
    
    public int minDistance(String word1, String word2) {
    dp=new int[word1.length()+1][word2.length()+1];
        for(int[] x:dp){
            Arrays.fill(x,-1);
        }
        return op(word1,word2,word1.length()-1,word2.length()-1);
    }
}