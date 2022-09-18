class Solution {
    
    public boolean feasible(int capacity,int[]weights,int days)
    {
        int currentcapacity=capacity;
        int i=0;
        while(days-->0)
        {
            currentcapacity=capacity;//new day,empty ship
            
            for(;i<weights.length;i++)
            {
                
                if(capacity<weights[i] )
                {
                return false;
                }
                if(currentcapacity<weights[i])
                {
                    break;
                }
                if((currentcapacity-weights[i])>=0)
                {
                    currentcapacity-=weights[i];
                }
                
            }
            if(i==weights.length)return true;
            
            
        }
        
        return false;
        
        
        
        
    }
    
    
    
    public int shipWithinDays(int[] weights, int days) {
        int max=0;
        int min=Integer.MAX_VALUE;
        for(int i:weights)
        {
            max+=i;//max capacity that could be taken
            if(min>i)min=i;
        }
        if(days==1)return max;
        int midweight=min+(max-min)/2;
        int min_feasible=midweight;
        while(min<=max)
        {
            midweight=min+(max-min)/2;
            if(feasible(midweight,weights,days))
            {
                
                if(midweight<min_feasible)min_feasible=midweight;
                max=midweight-1;
            }
            else
            {
                min=midweight+1;
            }
            
            
            
        }
        
        return min_feasible;
    }
}