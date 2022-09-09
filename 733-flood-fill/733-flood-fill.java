class Solution {
    
    
    public void fill(int[][]matrix,int r,int c,int color,int fillcolor)
    {
       if(r<0 || c<0||r>=matrix.length||c>=matrix[0].length)return ;
        
        if(matrix[r][c]==fillcolor)matrix[r][c]=color;//change color of given cell
         else return;//already colored itself and neighbour
            fill(matrix,r-1,c,color,fillcolor);
            fill(matrix,r+1,c,color,fillcolor);
            fill(matrix,r,c-1,color,fillcolor);
           fill(matrix,r,c+1,color,fillcolor);
        
    
    }
    
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        
        int initialcolor=image[sr][sc];
        if(initialcolor==color)return image;
    fill(image,sr,sc,color, initialcolor);
        return image;
        
        
        
    }
}