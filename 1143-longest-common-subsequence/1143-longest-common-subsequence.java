class Solution {
    
   int [][]matrix;
    
    public int f(String t1,String t2,int ind1,int ind2)
    {
        
        if(ind1==t1.length() || ind2==t2.length())
        {
            return 0;
        }
        int len=0;
        
        if(matrix[ind1][ind2]!=-1)
        {
            return matrix[ind1][ind2];
        }
        
        
        
        
        //match
        if(t1.charAt(ind1)==t2.charAt(ind2))
        {
            len=1+f(t1,t2,ind1+1,ind2+1);
        }
        else
        {
        len=len+Math.max(f(t1,t2,ind1+1,ind2),f(t1,t2,ind1,ind2+1));
        }
        
        matrix[ind1][ind2]=len;
        return  matrix[ind1][ind2];
    }
    
    
    
    public int longestCommonSubsequence(String text1, String text2) {
        
        int n=Math.max(text2.length(),text1.length());
        matrix=new int[n+1][n+1];
        
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {matrix[i][j]=-1;
            }
        }
        
        return f(text1,text2,0,0);
        
        
        
        
        
        
    }
}