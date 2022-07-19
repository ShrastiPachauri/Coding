class Solution {
    
   
    Stack<Integer> s=new Stack<Integer>();
    
    public int removeDuplicates(int[] nums) {
       
        s.push(nums[0]);
        
        for(int i=1;i<nums.length;i++)
        {
            if(s.peek()!=nums[i])
            {
                s.push(nums[i]);
            }
          
        }
         int ans=s.size();
        for(int i=s.size()-1;i>=0;i--)
        {
            nums[i]=s.pop();
            
        }
        return ans;
    }
}