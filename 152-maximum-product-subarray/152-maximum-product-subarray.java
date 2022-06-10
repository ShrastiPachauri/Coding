class Solution {
    public int maxProduct(int[] nums) {
        
        
      int p=1;
        
        int maxpr=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
           int t=i+1;
            p=nums[i];
            //System.out.println("Product with "+i+"  "+p);
            if(p>maxpr)
            {
                maxpr=p;
            }
           while(t<nums.length)
           {
               
               p*=nums[t];
               //System.out.println("Product with "+i+"  "+p);
               if(maxpr<p)
               {
                   maxpr=p;
                   
               }
               t++;
           }
            p=1;
            
        }
        
        return maxpr;
        
        
        
        
        
        
        
    }
}