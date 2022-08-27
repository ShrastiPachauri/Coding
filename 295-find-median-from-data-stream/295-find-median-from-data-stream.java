class MedianFinder {
   List<Integer> l;
   
    public MedianFinder() {
        l=new ArrayList<Integer>();
    }
    public void addNum(int num) {
        
        if(l.size()==0)
        {
            l.add(num);
            return;
        }
        for(int i=0;i<l.size();i++)
        {
            if(l.get(i)>num)
            {
                
                l.add(i,num);
                
                return;
            }
        }
        l.add(num);
       
    }
    public double findMedian() {
       
        if(l.size()%2==0)
        {
            return (l.get(l.size()/2)+l.get((l.size()/2)-1))/2.0;
        }
        return l.get(l.size()/2)/1.0;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */