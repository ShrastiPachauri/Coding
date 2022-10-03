class Solution {
    
    
    public boolean Ifpath(int n,ArrayList<ArrayList<Integer>> arr,int source,int destination,int[]visited){
        
        if(source==destination)return true;
        if(visited[source]==0){
            visited[source]=1;
        }
        
        for(int x:arr.get(source)){
            
            if(visited[x]==0){
                
                boolean r=Ifpath(n,arr,x,destination,visited);
                if(r)return true;
            }
            
            
        }
        return false;
        
        
    }
    
    
    
    
    
    
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        
        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
        
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<Integer>());
        }
        
        //fill
        
        for(int []x:edges){
            adj.get(x[0]).add(x[1]);
            adj.get(x[1]).add(x[0]);
        }
        int []visited=new int[n];
        
    return Ifpath(n,adj,source ,destination,visited);
        
        
        
        
        
        
    }
}