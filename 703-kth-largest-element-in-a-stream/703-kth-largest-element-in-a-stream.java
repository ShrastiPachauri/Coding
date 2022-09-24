class KthLargest {
PriorityQueue<Integer> pq;
    int limit;
    public KthLargest(int k, int[] nums) {
        
        pq=new PriorityQueue<Integer>();//min heap by def
        for(int x:nums){
            pq.add(x);
        }
        limit=k;
        
    }
    
    public int add(int val) {
        pq.add(val);
        while(pq.size()>limit){
            
            pq.poll();//minimum element
           
        }
        
         return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */