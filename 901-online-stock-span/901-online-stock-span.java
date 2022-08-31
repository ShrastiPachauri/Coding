class StockSpanner {
 Stack<Integer> stack;
 ArrayList<Integer> arr;
    int index=-1;
    public StockSpanner() {
       
      stack=new Stack<Integer>();
       arr=new ArrayList<Integer>();
    }
    
    public int next(int price) {
      
        index++;
        while(!stack.isEmpty() && arr.get(stack.peek())<=price)
        {
            stack.pop();
            
        }
        
        arr.add(price);
       
    
        
        if(stack.isEmpty())
        { stack.push(index);
            return index+1;
        }
        else
        {
             int r= (index-stack.peek());//span using index
             stack.push(index);
            return r;
        }
       
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */