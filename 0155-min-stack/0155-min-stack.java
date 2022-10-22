class MinStack {
Stack<Integer> st;
    int minimum=Integer.MAX_VALUE;
    public MinStack() {
        st=new Stack<Integer>();
    }
    
    public void push(int val) {
        if(minimum>val)minimum=val;
        st.push(val);
    }
    
    public void pop() {
        
        if(st.peek()==minimum){
            minimum=Integer.MAX_VALUE;
        
            st.pop();
            Stack<Integer> temp=new Stack<Integer>();
            while(!st.isEmpty()){
                int x=st.pop();
                if(x<minimum)minimum=x;
                temp.push(x);
            }
            while(!temp.isEmpty()){
                st.push(temp.pop());
            }
        }
        else{
            st.pop();
        }
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minimum;
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