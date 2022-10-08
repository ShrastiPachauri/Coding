class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        Deque<Integer> q=new ArrayDeque<Integer>();
        int ind=0;
        int[]ans=new int[nums.length-k+1];
        for(int in=0;in<nums.length;in++){
           
            if(q.isEmpty()){
                q.add(in);
                
            }
             else{
            if(q.peek()==in-k){
                q.poll();//poll First
            }
           
                
                while(!q.isEmpty() && nums[in]>nums[q.peekLast()]){
                    q.pollLast();
                }
                q.addLast(in);
             }
            if(in>=k-1){
                ans[ind++]=nums[q.peekFirst()];
            }
            
            
        }
        return ans;
        
    }
}