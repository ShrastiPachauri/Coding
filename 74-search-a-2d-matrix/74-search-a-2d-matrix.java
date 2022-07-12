class Solution {
    
   
    
    public boolean searchMatrix(int[][] matrix, int target) {
        
        
        //decide row
        int row=0;
        for(int i=0;i<matrix.length;i++)
        {
            if(target<=matrix[i][matrix[0].length-1])
            {
                row=i;
               
                break;
            }
        }
        //bsearch
         for(int i=0;i<matrix[0].length;i++)
         {
             if(target<matrix[row][0])
             {
                 return false;
             }
             
             int l=0;
             int h=matrix[0].length-1;
             int mid=l+(h-l)/2;
            
             while(l<=h)
             {
                 mid=l+(h-l)/2;
                 if(matrix[row][mid]==target)
                 {
                      System.out.println("target found "+i);
                     return true;
                 }
                 if(matrix[row][mid]<target)
                 {
                     l=mid+1;
                 }
                 else
                 {
                     h=mid-1;
                 }
                 
                 
                 
             }
             
             
             
             
             
         }
        return false;
}
}