class Solution {
     public boolean isPalindrome(String s)
    {
         //System.out.println("called palindrome "+s);
         if(s.length()==0)
         {
             return false;
         }
         char[]arr=s.toCharArray();
         int j=s.length()-1;
         for(int i=0;i<=j;i++)
         {
             if(arr[i]!=arr[j])
             {
                 return false;
             }
             j--;
         }
         return true;
         
     }
    
    List<List<String>> ans;
    public void f(String s,int index,List<String> l)
    {
        if(index==s.length())
        {
            ArrayList<String> a=new ArrayList<String>(l);
            ans.add(a);
            return;
        }
        
        
        for(int i=index;i<=s.length();i++)
        {
            if(isPalindrome(s.substring(index,i)))
            {
                
                l.add(s.substring(index,i));
                f(s,i,l);
                l.remove(l.size()-1);
            }
            
            
            
            
        }
        
    }
    
    public List<List<String>> partition(String s) {
        ans=new ArrayList<List<String>>();
        f(s,0,new ArrayList<String>());
        //System.out.println("size of ans is "+ans.size());
        return ans;
        
        
    }
}