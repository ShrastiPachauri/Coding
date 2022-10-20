class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<Character>();
        for(char x:s.toCharArray()){
        
            if(!st.isEmpty()){
                if(x==')'){
                    
                    if(st.peek()=='('){
                        st.pop();
                    }
                    else return false;
                }
                else if(x=='}'){
                    if(st.peek()=='{'){
                        st.pop();
                    }
                    else return false;
                }
                else if(x==']'){
                    if(st.peek()=='['){
                        st.pop();
                    }
                    else return false;
                }
                else{
                    st.push(x);//any opening brace;
                }
            }
            else
            {st.push(x);}
        }
        if(st.isEmpty())return true;
        return false;
        
        
    }
}