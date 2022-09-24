class MedianFinder {
   PriorityQueue<Integer> maxheap;
    PriorityQueue<Integer>minheap;
   
    public MedianFinder() {
        maxheap=new PriorityQueue<>(Collections.reverseOrder());//first half
        minheap=new PriorityQueue<>();//second half
        
    }
    public void addNum(int num) {
        
        if(maxheap.size()==0 || num<maxheap.peek() ){
              maxheap.add(num);
          }
           else
           {
               minheap.add(num);
           }
        
        
        
        
        
        
        
        if(maxheap.size()>minheap.size()+1){
            minheap.add(maxheap.peek());
            maxheap.poll();
        }
      if(maxheap.size()+1<minheap.size())
      {
          maxheap.add(minheap.peek());
          minheap.poll();
      }
          
       
    }
    public double findMedian() {
       
        if(minheap.size()==0)return maxheap.peek();
       if((maxheap.size()+minheap.size())%2==0)
       {
           return((maxheap.peek()+minheap.peek())/2.0);
       }
        else 
            return maxheap.size()>minheap.size()?maxheap.peek():minheap.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */