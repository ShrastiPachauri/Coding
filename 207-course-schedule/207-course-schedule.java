class Solution {
    
    public boolean dfs(int[]visited,int v,int[]dfsvisited,List<List<Integer>> l)
    {
        visited[v]=1;
        dfsvisited[v]=1;
       System.out.println("in path of"+v);
        for(int x:l.get(v))
        {
            if(visited[x]==0)
            {
                boolean res= dfs(visited,x,dfsvisited,l);
                if(res==true)
                {
                    return true;
                }
            }
            else if(visited[x]==1 && dfsvisited[x]==1)
            {
             return true;
            }
            
            
            
        }
        System.out.println("completed "+v);
        dfsvisited[v]=0;
        return false;//cycle not found
        
        
    }
    
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
       List<List<Integer>> l=new ArrayList<List<Integer>>(numCourses);
        for(int i=0;i<numCourses;i++)
        {
           l.add(new ArrayList<Integer>());
        }
        for(int[] x:prerequisites)
        {
            l.get(x[0]).add(x[1]);
            
        }
        
        
        
        int[]visited=new int[numCourses];
        int[]dfsvisited=new int[numCourses];
        
        for(int [] x:prerequisites)
        {
            int i=x[0];
            if(visited[i]==0)
            {
                if(dfs(visited,i,dfsvisited,l)==true)
                {
                    return false; 
                }
            }
            
            
        }
        return true;
        
    }
}