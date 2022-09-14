class Solution {
    public String getPermutation(int n, int k) {
        ArrayList<Integer> a=new ArrayList<Integer>();
        String answer="";
        int fact=1;//factorial of n-1 elements 
        for(int i=1;i<n;i++)
        {
            a.add(i);
            fact=fact*(i);
        }
        //add last element in list also 123
        a.add(n);
        k=k-1;// assuming theer are o to k-1 permutations possible
        
        while(true)
        {answer+=a.get(k/fact);
         a.remove(k/fact);
        k=k%fact;
        
         if(a.size()==0)break;
        fact=fact/a.size();  /**imp point to be noted**/
        }
       return answer;
        
    }
}