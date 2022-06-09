class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
        
        for(int i=0;i<nums.length;i++)
        {
            hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<Map.Entry<Integer,Integer>>(Map.Entry.comparingByValue());
        for(Map.Entry x:hs.entrySet())
        {
            pq.add(x);
            // System.out.println("key and value "+x.getKey()+"  "+x.getValue());
        }
        int []ans=new int[k];
        int index=0;
        for(int i=0;i<hs.size();i++)
        {
            
            if(pq.size()<=k)
            {int x=pq.remove().getKey();
            // System.out.println("got key "+x);
            ans[index++]=x;
            }
            else
            {
                pq.remove();
            }
        }
        return ans;
    }
}