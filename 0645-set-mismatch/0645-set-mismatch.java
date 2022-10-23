class Solution {
    public int[] findErrorNums(int[] nums) {
        int[]hash=new int[nums.length+1];
        for(int x:nums){
            hash[x]++;
        }
        int[]ans=new int[2];
        for(int i=1;i<hash.length;i++){
            if(hash[i]==0){
                ans[1]=i;
            }
            if(hash[i]==2){
                ans[0]=i;
            }
        }
        return ans;
    }
}