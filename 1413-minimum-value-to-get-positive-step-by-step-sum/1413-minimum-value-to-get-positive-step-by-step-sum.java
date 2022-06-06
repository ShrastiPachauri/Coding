class Solution {
    public int minStartValue(int[] nums) {
        
       int min=Integer.MAX_VALUE;
        int start=1;
        boolean change=false;
        int sum=0;
        for(int x:nums)
        {
            sum+=x;
            if(sum<1)
            {
                change=true;
                start=(-1*sum)+1;
            }
        }
        
        
        
         int ssum=0;
    boolean flag=true;
        while(true)
        {
          flag=true;
            int x=start;
            ssum=start;
            for(int j=0;j<nums.length;j++)
            {
               ssum+=nums[j];
                //System.out.println("sum after the iterartion   " +ssum);
                if(ssum<1)
                {
                    flag=false;
                    ssum=0;
                    break;
                }
                
                
                
            }
            if(flag==true)
            {
                return x;
            }
            start++;
        }
        //return -1;
    }
}