class Solution {
    public int singleNonDuplicate(int[] arr) {
        
       
        //System.out.println("sorted array "+arr);
      if(arr.length==1)
      {
          return arr[0];
      }
        
        for(int i=0;i<arr.length-1;)
        {
          
            if(arr[i]!=arr[i+1] )
            {
                return arr[i];//unique
            }
            
                i+=2;
            
        }
        //means nothing returned so far,odd list no unique found till now
        
        return arr[arr.length-1]; //last element of odd list
       
        
        
        
        
        
        
        
        
        
    }
}