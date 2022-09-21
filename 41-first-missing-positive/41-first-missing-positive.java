class Solution {
    public int firstMissingPositive(int[] nums) {
for(int i=0;i<nums.length;i++)
{
if(nums[i]<=0||nums[i]>nums.length)
{
nums[i]=nums.length+2;//so that can identify non req values
}
}

for(int i=0;i<nums.length;i++)
{
if( nums[i]==nums.length+2)//don’t mark for neg or very large value
{
continue;
}

if(nums[i]<0)
{
int  x=-1*nums[i];
    if(x==nums.length+2)continue;

    if(nums[x-1]>0)//not marked yet ,for repeated values
    {nums[x-1]=-1*nums[x-1];}
}
else
{
    if(nums[nums[i]-1]>0)//not marked yet ,for repeated values
    {nums[nums[i]-1]=-1*nums[nums[i]-1];}
}

}




for(int i=0;i<nums.length;i++)
{
if(nums[i]>0)
{
return i+1;
}
}
        return nums.length+1;
}

    
    }
