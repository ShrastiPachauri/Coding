class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        int n=nums.length-k;
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++)
        {
            pq.add(nums[i]);
        }
        int res=0;
        for(int i=0;i<k;i++)
        {
           res=pq.remove();
        }
        return res;
    }
}