class Solution {
    
    int[][]cache;
    public static final int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    
    public int length(int[][]matrix,int i,int j,int m,int n,int[][]cache){
        
        if(cache[i][j] != -1) return cache[i][j];
    int max = 1;
    for(int[] dir: dirs) {
        int x = i + dir[0], y = j + dir[1];
        if(x < 0 || x >= matrix.length || y < 0 || y >= matrix[0].length || matrix[x][y] <= matrix[i][j]) continue;
        int len = 1 + length(matrix, x, y, m, n, cache);
        max = Math.max(max, len);
    }
    cache[i][j] = max;
    return max;
        
        
    }
    
    
    
    
    
    public int longestIncreasingPath(int[][] matrix) {
       
        cache=new int[matrix.length+1][matrix[0].length+1];
        for(int[]x:cache){
            Arrays.fill(x,-1);
        }
        int l=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++)
        {
        for(int j=0;j<matrix[0].length;j++)
            {
                int x=length(matrix,i,j,matrix.length,matrix[0].length,cache);
                if(l<x)l=x;
        }
        }
        
          return l;     
        
             
}
}