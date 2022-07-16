class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
        {
            return 0;
        }
        
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
        
        
        for(int x:nums)
        {
            pq.add(x);
        }
        int flag=0;
        int curr=-1;
        int cnt=1;
        int max=1;
        while(pq.size()>0)
        {
            if(flag==0)
            {
                curr=pq.poll();
                //System.out.println("curr is "+curr);
                flag=1;
                continue;
                
                
            }
            if((pq.peek()-curr)==0)
                {
                    pq.poll();
                    continue;
                }
            if((pq.peek()-curr)==1  )
            {
                curr=pq.poll();
                 //System.out.println("curr is "+curr);
                cnt++;
                 //System.out.println("cnt "+cnt);
            }
            else
            {
                if(cnt>max)
                {
                    max=cnt;
                }
                cnt=1;
                curr=pq.poll();
            }
            
            
            
        }
        if(cnt>max)
        {
            max=cnt;
        }
        return max;
        
    }
}