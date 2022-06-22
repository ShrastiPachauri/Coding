error at [1,0,0] because i 0 in stack
​
​
if(s.size()%2!=0)
{
s.pop();//pop the centre unique value
}
while(slow!=null)
{
if(s.peek()!=slow.val)
{
return false;
}
s.pop();
slow=slow.next;
}
if(s.size()!=0)
{
return false;
}
return true;
}
}
​
//wrong when stack has less than 3 value