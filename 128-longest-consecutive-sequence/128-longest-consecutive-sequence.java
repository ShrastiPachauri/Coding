class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Integer>hs=new HashMap<Integer,Integer>();
for(int i=0;i<nums.length;i++){
hs.put(nums[i],1);//all distinct numbers with occurences
}
//1 2 2 10 11 3 4 5
int max=0;
for(int j=0;j<nums.length;j++){
if(hs.containsKey(nums[j]-1)){
continue;
}
else
{
int cnt=hs.get(nums[j]);//first element of seq
int i=1;
while(hs.containsKey(nums[j]+i)){
    
cnt+=hs.get(nums[j]+1);
i++;  
}
if(cnt>max)max=cnt;
}
}
     return max;
    }
}