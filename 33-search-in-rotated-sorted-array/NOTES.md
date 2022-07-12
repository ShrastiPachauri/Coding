**Mistakes**
for(int i=1;i<nums.length-1;i++){
if(nums[i]<nums[i-1] && nums[i]<nums[i+1])
{
valley=i;
break;
}
}
if valley is at one itself (missing edge case)
[5,1,3] -->for target 5
​