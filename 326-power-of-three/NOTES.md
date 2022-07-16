//Mistake ,This code is to check multiple or not
​
​
​
if(div>=(n/2))
{
return false;
}
if((n%div)==0)
{
return true;
}
return check(n,div*3);