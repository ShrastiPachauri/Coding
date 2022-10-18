class MedianFinder {
 PriorityQueue<Integer> maxheap;
     PriorityQueue<Integer> minheap;
    public MedianFinder() {
        maxheap=new PriorityQueue<Integer>(Collections.reverseOrder());
        minheap=new PriorityQueue<Integer>();
        
    }
    
    public void addNum(int num) {
        if(maxheap.isEmpty()){
            maxheap.add(num);
        }
        else if(num<maxheap.peek()){
            maxheap.add(num);
        }
        else{
            minheap.add(num);
        }
        
        
        
        if((int)Math.abs(maxheap.size()-minheap.size())>1){
            if(minheap.size()>maxheap.size()){
                int val=minheap.poll();
                maxheap.add(val);
            }
            else{
                int val=maxheap.poll();
                minheap.add(val);
            }
        }
        if(minheap.size()!=0 && minheap.size()-maxheap.size()==1){
            
            int v=minheap.poll();
            maxheap.add(v);
            
        }
    }
    
    public double findMedian() {
        if((minheap.size()+maxheap.size())%2==0){
            return (minheap.peek()+maxheap.peek())/2.0;
        }
        else{
            return maxheap.peek();
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */