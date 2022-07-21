class Solution {
    public boolean backspaceCompare(String s, String t) {
        
       Stack<Character> st=new Stack<Character>();
         Stack<Character> T=new Stack<Character>();
        char []arr=s.toCharArray();
        
        for(char x:arr)
        {
            if(x=='#')
            {
                if(st.size()>0)
                {st.pop();}
            }
            else
            {
                st.push(x);
            }
        }
       
        
        arr=t.toCharArray();
        
         for(char x:arr)
        {
            if(x=='#')
            {
                if(T.size()>0)
                {T.pop();}
            }
            else
            {
                T.push(x);
                //System.out.println("T push "+x);
            }
        }
        
       while(st.size()!=0 && T.size()!=0)
        {
            // System.out.println("T peek "+T.peek()+" s peek"+st.peek());
            if(T.peek()==st.peek())
            { System.out.println("same peek");
                T.pop();
                st.pop();
            }
            else
            {
                return false;
            }
        }
        if(T.size()==0 && st.size()==0)
        {
            //System.out.println("0 size");
            return true;
        }
        return false;
}
}