class Solution {
    
    
    int [][]matrix;
    
    
    
    
    
    int f(int []nums,int prev,int curr,int n)
    {
    
    //base
        if(curr==n)
        {
            return 0;
        }
    
    //left subtree --befor backtracking
        if(matrix[prev+1][curr+1]!=-1)
        {
            return matrix[prev+1][curr+1];
        }
        
       int len=0+ f(nums,prev,curr+1,n);
        
        //right subtree -after return tree to backtrk
        
        if(prev==-1||nums[curr]>nums[prev])
        {
            
            len=Math.max(len, 1+f(nums,curr,curr+1,n));
            
            
            
        }
        matrix[prev+1][curr+1]=len;
        
        
        
        
    
    return  matrix[prev+1][curr+1];
    
    
    }
    public int lengthOfLIS(int[] nums) {
        
        matrix=new int[nums.length+1][nums.length+1];
        for(int i=0;i<matrix.length;i++)
        {
        for(int j=0;j<matrix[0].length;j++)
        {
            matrix[i][j]=-1;
            
            }
        }
        return f(nums,-1,0,nums.length);
        
        
        
        
        
    }
}