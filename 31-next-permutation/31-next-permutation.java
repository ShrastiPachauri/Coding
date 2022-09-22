class Solution {
public void reverse(int[] s,int in){
int j=s.length-1;
    int i=in;
while(i<j){
int x=s[i];
s[i]=s[j];
s[j]=x;
i++;
j--;
}
}
    
    
    
    
public void nextPermutation(int[] s) {
        

if(s.length==1)return ;
int index=-1;//mark index default value

   int i=s.length-2; 
    
while(i>=0 && s[i]>=s[i+1])i--;//peechee se bhi increasing seq hota hai
   

 int j=s.length-1;
    if(i>=0)
    {while( s[j]<=s[i])j--;

//swap
    int x=s[i];
    s[i]=s[j];
    s[j]=x;
    }
    //reverse
    reverse(s,i+1);
 
}
     
    }