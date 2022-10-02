


class Solution {
    static int[][]dir={{1,0},{-1,0},{0,-1},{0,1}};
    
   public void dfs(int[][]heights,int r,int c,int[][]mark){
     
       mark[r][c]=1;
       for(int i=0;i<4;i++){
           
           int x=r+dir[i][0];
           int y=c+dir[i][1];
           if(x<0||x>=heights.length||y<0||y>=heights[0].length)continue;
           
           if( heights[x][y]>=heights[r][c] && mark[x][y]==0){
               //System.out.println("x and y "+x+""+y);
               dfs(heights,x,y,mark);
           }
          
           
       }
       
   }
    
   
    
    
    public List<List<Integer>> pacificAtlantic(int[][] heights){
        ArrayList<List<Integer>>ans=new ArrayList<List<Integer>>();
        
       int[][]p=new int[heights.length][heights[0].length]; 
       int[][]ao=new int[heights.length][heights[0].length];
        
        //for pacific
        for(int i=0;i<heights.length;i++){
            dfs(heights,i,0,p);
        }
         for(int i=0;i<heights[0].length;i++){
            dfs(heights,0,i,p);
        }
        
        
        //for atlantic
         for(int i=0;i<heights.length;i++){
            dfs(heights,i,heights[0].length-1,ao);
        }
         for(int i=0;i<heights[0].length;i++){
            dfs(heights,heights.length-1,i,ao);
        }
        
        //common to both
        for(int i=0;i<heights.length;i++){
            for(int j=0;j<heights[0].length;j++){
                
                if(p[i][j]==1 && p[i][j]==ao[i][j]){
                    
                    List<Integer>l=new ArrayList<Integer>();
                    l.add(i);
                    l.add(j);
                    ans.add(l);
                    
                    
                }
                
            }
           
        }
        
        return ans;
        
    
    }
                  
}       
