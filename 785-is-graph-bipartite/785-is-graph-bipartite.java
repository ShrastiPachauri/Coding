class Solution {
    
    public boolean possible(int[][]graph,int[]colored,int node,int col){
        
        for(int x:graph[node]){//all adj of this node
            
            if(colored[x]==col)return false;
        }
        
        return true;
        
        
    }
    
    
    public boolean color(int[][]graph,int[]colored,int i){
        
       if(colored[i]==-1){
           
               colored[i]=1;
           }      
            
        for(int x:graph[i]){
            
            if(colored[x]==-1)
            { boolean r=possible(graph,colored,x,1-colored[i]);
            
             if(r==false)return false;
              colored[x]=1-colored[i];
            boolean res=color(graph,colored,x);
             if(res==false)return false;
            }
        }
        return true;
        
    }
    
    
    public boolean isBipartite(int[][] graph) {
     
        int[]visited=new int[graph.length];
        int[]colored=new int[graph.length];
        Arrays.fill(colored,-1);
        for(int i=0;i<graph.length;i++){
            if(colored[i]==-1){
                boolean r=color(graph,colored,i);
                if(r==false)return false;
                
            }
            
        }
        return true;
    }
}