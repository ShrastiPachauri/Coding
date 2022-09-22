class Solution {
    //4C2=
    
   
    
    
    
    
    
    
    public List<Integer> getRow(int rowIndex) {
        
        //every row of a pascals triangle can be represented as nCr where n is row index ans r is col index
        long v=rowIndex/1;
        List<Integer>ans=new ArrayList<Integer>();
        int n=rowIndex;
        for(int i=0;i<=rowIndex;i++)
        {
            if(i==0 || i==rowIndex)
            {ans.add(1);}
            
            else if(i==1||i==rowIndex-1)
            {
                ans.add(rowIndex);
            }
            else
            {
               ans.add( (int)((v*(rowIndex-i+1))/i));
                v=v*(rowIndex-i+1)/i;//update 
            }
            
        }
       return ans;
    }
}