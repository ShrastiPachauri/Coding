class MinStack {

    ArrayList<Integer> arr;
   
    PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
    public MinStack() {
        arr=new ArrayList<Integer>();
        
    }
    
    public void push(int val) {
       
      
        arr.add(val);
        pq.add(val);
        
    }
    
    public void pop() {
        
        pq.remove(arr.get(arr.size()-1));
      
        arr.remove(arr.size()-1);
       
        
    }
    
    public int top() {
        return arr.get(arr.size()-1);
    }
    
    public int getMin() {
        return pq.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */