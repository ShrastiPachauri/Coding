class Solution {
    
public int merge(int[]arr,int[]temp,int left,int mid,int right){
int i=left;
int j=mid+1;
int k=left;
int count=0;
   
while(i<=mid && j<=right){

while(j<=right && (arr[i]>2L*arr[j])){
    //System.out.println("count++ for"+i+" "+j);
count+=mid+1-i;
    j++;
}
i++;
}
    int l=left;
    int r=mid+1;
while(l<=mid && r<=right){
    
    if(arr[l]<arr[r])temp[k++]=arr[l++];
    else temp[k++]=arr[r++];
    
}


while(l<=mid)temp[k++]=arr[l++];
while(r<=right)temp[k++]=arr[r++];
for(int in=left;in<=right;in++){
arr[in]=temp[in];
}
    
return count;
}

    
public int mergeSort(int[]arr,int[]temp,int left,int right)
{int cnt=0;
if(left<right){
int mid=(left+right)/2;
cnt+=mergeSort(arr,temp,left,mid);
cnt+=mergeSort(arr,temp,mid+1,right);
cnt+=merge(arr,temp,left,mid,right);
}
 
return cnt;
}

    
public int reversePairs(int[] nums) {        
 int []temp=new int[nums.length];
int ans= mergeSort(nums,temp,0,nums.length-1);
    
   
    return ans;
    
    
    }
}