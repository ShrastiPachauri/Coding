class Solution {
    
    Stack<Character> st=new Stack<Character>();
    
    
    public void generateP(List<String> l,String open,String close,int on,int cn,String temp){
        if(on<0 || cn<0)return;
        if(on==0 && cn==0){
            l.add(temp);
        }
       
        
            st.push(open.charAt(0));
            generateP(l,open,close,on-1,cn,temp+open.charAt(0));
            st.pop();
             
            if(!st.isEmpty())
            {char x=st.peek();
            st.pop();
            generateP(l,open,close,on,cn-1,temp+close.charAt(open.indexOf(x)));
            st.push(x);
            }
        
        
        
        
        
    }
    
    public List<String> generateParenthesis(int n) {
        List<String> l=new ArrayList<String>();
        String open="(";
        String close=")";
        
        generateP(l,open,close,n,n,new String());
        
        return l;
        
    }
}