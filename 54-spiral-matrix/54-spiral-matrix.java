class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> l=new ArrayList<Integer>();
        //right
        
        int unvisited=matrix.length*matrix[0].length;
        int visited=0;
        
        int row=0;
        int col=0;
        while(visited!=unvisited)
        {
        for(int i=row;col<matrix[0].length;col++)
        {
             System.out.println("row is "+row+ " col "+col);
            if(matrix[i][col]!=1000)
            {l.add(matrix[i][col]);
            matrix[i][col]=1000;//visited
             System.out.println("visited (right)"+i+" "+col+" "+matrix[i][col]);
             visited++;
            }
            else
            {
                col--;
                break;
            }
            
            
        }
            System.out.println("visited and un"+visited+" "+unvisited);
        if(visited==unvisited)
        {
            break;
        }
        
        //down
        if(col==matrix[0].length)
        {col--;}
        for(row=row+1;row<matrix.length;row++)
        {
            if(matrix[row][col]!=1000)
            {l.add(matrix[row][col]);
             matrix[row][col]=1000;//visited
             System.out.println("visited (down)"+row+" "+col+" "+matrix[row][col]);
             visited++;
            }
            else
            {
                row--;
                break;
            }
        }
        if(row==matrix.length)
        {row--;
        }
        col--;
        if(visited==unvisited)
        {
            break;
        }
            System.out.println("visited and un"+visited+" "+unvisited);
           
        //left
          System.out.println("for down "+row+" "+col);
        for(;col>=0;col--)
        {
            if(matrix[row][col]!=1000)
            { System.out.println("visited (left)"+row+" "+col+" "+matrix[row][col]);
            l.add(matrix[row][col]);
             matrix[row][col]=1000;//visited
             visited++;
            }
            else
            {
                col++;
                break;
            }
        }
        
        if(col==-1)
        {
            col++;
        }
       if(visited==unvisited)
        {
            break;
        }
            System.out.println("visited and un"+visited+" "+unvisited);
        //top
        --row;
        for(;row>=0;row--)
        {
            if(matrix[row][col]!=1000)
            {l.add(matrix[row][col]);
             matrix[row][col]=1000;//visited
             System.out.println("visited (top)"+row+" "+col+" "+matrix[row][col]);
             visited++;
            }
            else
            {
                row++;
                break;
            }
        }
            col++;
         if(row<0)
         {
             row++;
         }
            if(visited==unvisited)
        {
            break;
        }
        System.out.println("visited and un"+visited+" "+unvisited +"for next "+row +" "+col);
        }
        return l;
    }
}