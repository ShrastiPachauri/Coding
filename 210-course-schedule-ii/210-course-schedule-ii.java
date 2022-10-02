class Solution {
    
    public boolean dfs(ArrayList<List<Integer>> adj,int[]dfsvisited,int[]visited,int course,List<Integer>ans){
        
        if(visited[course]==0){
            visited[course]=1;
            dfsvisited[course]=1;
            
        }
        
        //all adj
        
        for(int x:adj.get(course)){
            
            if(visited[x]==0){
                
                boolean r=dfs(adj,dfsvisited,visited,x,ans);
                if(r)return true;
            }
            if(visited[x]==1 && dfsvisited[x]==1){
                return true;//cycle
            }
            
        }
        ans.add(course);
        dfsvisited[course]=0;//it simply represent current path tracking
        return false;
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        ArrayList<List<Integer>>adj=new ArrayList<List<Integer>>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<Integer>());
        }
        
        for(int[]x:prerequisites){
            adj.get(x[0]).add(x[1]);
        }
        ArrayList<Integer>order=new ArrayList<Integer>();
        int[]dfsvisited=new int[numCourses];
        
        int[]visited=new int[numCourses];
        
        for(int i=0;i<visited.length;i++){
            
            if(visited[i]==0){
                boolean r=dfs(adj,dfsvisited,visited,i,order);
                if(r==true)return new int[0];
            }
        }
        
        if(order.size()!=numCourses)return new int[0];
        int[]ans=new int[numCourses];
        int in=0;
        for(int x:order){
            ans[in++]=x;
        }
        
        return ans;
        
        
    }
}