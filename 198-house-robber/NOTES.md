//I was thinking greedily but it won't work b/c ,,,jaroori nahi hai saare alternate houses ko rob karna ...agar kam value wale ko skip kar denge ,toh jyadavalue wala le sakte hain
​
int max=Integer.MIN_VALUE;
for(int i=0;i<nums.length;i++){
int sum=0;
for(int j=i;j<nums.length;j+=2){
sum+=nums[j];
}
for(int j=i-2;j>=0;j-=2){
sum+=nums[j];
}
if(sum>max)max=sum;
}
return max;
}
//dp to choose wisely