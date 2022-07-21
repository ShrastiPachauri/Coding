//observe code --> how smartly it is handling x=2, n=0 :)\
​
​
Striver
​
double ans = 1.0;
long nn = n;
if (nn < 0) nn = -1 * nn;
while (nn > 0) {
if (nn % 2 == 1) {
ans = ans * x;
nn = nn - 1;
} else {
x = x * x;
nn = nn / 2;
}
}
if (n < 0) ans = (double)(1.0) / (double)(ans);
return ans;
MyCode
public double myPow(double x, int n) {
if(n==1)//for positive power 1<--
{
return x;
}
if(n==-1)//for negative power -->0
{
return (1/x);
}
if(n>0)
{ return x*myPow(x,n-1);}
else
{
return (1/x)*myPow(x,n+1);
}
}