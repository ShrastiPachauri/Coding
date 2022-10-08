//Brute
​
if(s2.length()<s1.length())return false;
char[]st1=s1.toCharArray();
Arrays.sort(st1);
int last=s2.length()-s1.length();
for(int i=0;i<=last;i++){
String curr=s2.substring(i,i+s1.length());
char[]arr=curr.toCharArray();
Arrays.sort(arr);
if(Arrays.equals(st1,arr)){
return true;
}
}
return false;