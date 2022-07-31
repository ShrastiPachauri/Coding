class NumArray {
int []N;
    int total=0;
    public NumArray(int[] nums) {
        N=nums;
        for(int x:nums)
        {
            total+=x;
        }
        
    }
    
    public void update(int index, int val) {
        
        total=total+val-N[index];
        N[index]=val;
    }
    
    public int sumRange(int left, int right) {
        
       int sum=total;
        for(int i=0;i<left;i++)
        {
            sum-=N[i];
        }
        
        for(int i=right+1;i<N.length;i++)
        {
           sum-=N[i];
        }
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */