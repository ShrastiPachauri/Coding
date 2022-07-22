class Solution {
    public int maxProfit(int[] prices) {
        
        int netProfit=0;
        int start=prices[0];
        int end=prices[0];
        for(int i=1;i<prices.length;i++)
        {
            
           if(prices[i]<end)
            {
                 netProfit+=(end-start);
                System.out.println("netProfit  "+netProfit);
                    start=prices[i];
                    end=prices[i];
                
            }
            else if(prices[i]<start)
            {
                start=prices[i];
                end=prices[i];
                //System.out.println("start and end are "+start+" "+end);
            }
            else if(prices[i]>end)
            {
                end=prices[i];
               
            }
            
            
            
            
            
        }
        netProfit+=(end-start);//understand welll  ;) last stock transaction must be included
        return netProfit;
        
        
    }
}