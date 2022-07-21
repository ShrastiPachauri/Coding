class Solution {
    public int minOperations(String[] logs) {
        int cnt=0;
        for(int i=0;i<logs.length;i++)
        {
            
            if(logs[i].contains("../"))
            {
                if(cnt!=0)
                {cnt--;}
            }
            else if(logs[i].contains("./"))
            {
                continue;
            }
            else
                cnt++;
            
        }
        return cnt;
    }
}