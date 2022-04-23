class Solution {
    
    
    
    
    public boolean isAnagram(String input1,String input2)
    {
        if(input1.length()!=input2.length())
        {
            return false;
        }
        
        char[] arr1=input1.toCharArray();
         char[] arr2=input2.toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    if(Arrays.equals(arr1,arr2))
        {
          return true;  
        }
        
        return false;
    }
    
  
    
    
    public List<List<String>> groupAnagrams(String[] strs) {
       HashSet<Integer> visited=new HashSet<Integer>();
        
        List<List<String>> ans=new ArrayList<List<String>>();
        
        for(int i=0;i<strs.length;i++)
        {
            if(visited.contains(i))
            {
                continue;
            }
            
             List<String> sub=new ArrayList<String>();
           for(int j=i+1;j<strs.length;j++)
        {
               if(!visited.contains(j))
               {
            if(isAnagram(strs[i],strs[j]))
            {  sub.add(strs[j]);
             visited.add(j);
            }
            
               }
            
           } 
              sub.add(strs[i]);
                 visited.add(i);
           ans.add(sub);
        }
        
        return ans;
        
    }
}