class Solution {
    
    //leetcode
    int dp[];
    public boolean checkWordBreak(String s,List<String>wordDict,int index){
        if(index==s.length())return true;
        if(dp[index]!=-1)
        {
            if(dp[index]==1)return true;
            else return false;
        }
        for(int i=index;i<=s.length();i++){
            
            if(wordDict.contains(s.substring(index,i))){
                
                boolean next=checkWordBreak(s,wordDict,i);
                if(next==false){
                    continue;
                }
                else 
                {dp[index]=1;
                    return true;
                }
            }
            if(i==s.length()){
             dp[index]=0;
             return false;
            }
        }
        
        return false;//dummy
    }
    

    public boolean wordBreak(String s, List<String> wordDict) {
        
        dp=new int[301];
        Arrays.fill(dp,-1);
        return checkWordBreak(s,wordDict,0);
     
    }
}