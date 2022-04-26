class Solution {
    public int[] plusOne(int[] digits) {
        
        int carry=0;
        int x=0;
        Stack<Integer> s=new Stack<Integer>();
        
        for(int i=digits.length-1;i>=0;i--)
        {
            if(i==digits.length-1)
            {
                x=digits[i]+1;
            }
            else
            {
                x=digits[i]+carry;
            }
            
           s.push(x%10);
            System.out.println("pushed "+(x%10));
            carry=x/10;
        
        }
        if(carry!=0)
        {
            s.push(carry);
        }
        int ans[]=new int[s.size()];
        int in=0;
        while(s.size()!=0)
        {
           ans[in++]=s.pop();
        }
        
        return ans;
        
        
        
        
        
        
        
    }
}