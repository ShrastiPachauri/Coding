class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        
        
        int[][]ans=new int[0][0];
        if(original.length!=(m*n))
        {
           //System.out.println("returning empty 2d array");
            return ans;
        }
         ans=new int[m][n];
        int row=0;
        for(int i=0;i<original.length;i++)
        {
            if(i>0 && i%n==0)
            {
                row++;
                if(row==m)
                {
                    break;
                }
            }
            
            ans[row][i%n]=original[i];
            
            
            
            
        }
        return ans;
        
        
        
        
        
        
        
        
        
        
    }
}