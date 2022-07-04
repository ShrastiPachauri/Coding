class Solution {
    public int maxProfit(int[] prices) {
     
         int start=prices[0];
       
        int end=prices[0];
       
        
        int max=end-start;
        for(int i=0;i<prices.length;i++)
        {
          
            if(prices[i]<start)
            {
                start=prices[i];
                
                end=prices[i];
                
            }
            if(prices[i]>end)
            {
                end=prices[i];
                if(max<(end-start))
                {
                    max=end-start;
                }
            }
        }
        return max;
    }
}