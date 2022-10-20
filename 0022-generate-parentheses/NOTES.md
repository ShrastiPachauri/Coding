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
​
open="({["
close="({["