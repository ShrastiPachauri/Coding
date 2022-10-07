class Solution {
    public int maxProfit(int[] prices) {
        
        int start=0;
        int end=0;
        int profit=0;
        for(int i=0;i<prices.length;i++){
            
            if(prices[i]>prices[end]){
                end=i;
            }
            if(prices[i]<prices[end]){
                
                profit+=(prices[end]-prices[start]);//1 share profit
                start=i;
                end=i;
               
            }
        }
        
        profit+=(prices[end]-prices[start]);
        return profit;
        
        
    }
}