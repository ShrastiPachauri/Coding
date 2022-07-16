>//Mistake
​
1.I was missing this line
​
if(cnt>max)
{
max=cnt;
}
at end therefore when we are getting sequential value till end ,max was not getting updated
Test -->[0,3,7,2,5,8,4,6,0,1]
2.I was taking curr=-1 for initial value but failing ,So always take bool or flag not actual current that pointing to element
​
Test-->[-1,0]
​
3.(pq.peek()-curr)==0 //Not understood this case before