class Solution {
    
    public int findJudge(int n, int[][] trust) {
     int[][]edges=new int[n+1][n+1];
        boolean[]visited=new boolean[n+1];
        
        for(int i=0;i<trust.length;i++)//adjacency matrix populated as per edge list
        {
            int x=trust[i][0];     
            int y=trust[i][1];
            edges[x][y]=1;//directed
           
          
        }

        int cnt=0;
        int judge=-1;
      for(int i=1;i<edges.length;i++)
      {
          
          for(int j=1;j<edges.length;j++)
          {
              if(edges[j][i]==1) //column wise 
              {
                  cnt++;
              }
              
          }
          
          if(cnt==(n-1))
          {
              judge=i;
              break;
          }
          cnt=0;
          
      }
        if(judge==-1)
        {
            return -1;
        }
        
      for(int i=1;i<edges.length;i++)
      {
        if(edges[judge][i]==1)
        {
            return -1;
        }
          
         
        }
        return judge;
    }
}