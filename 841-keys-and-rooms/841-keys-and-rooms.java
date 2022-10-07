class Solution {
    
    
    public void visit(int room,List<List<Integer>> rooms,int[]visited){
        
        if(visited[room]==0){
            visited[room]=1;//marked 
        }
        
        for(int r:rooms.get(room)){
            
            if(visited[r]==0){
                visit(r,rooms,visited);
            }
            
        }
        
        
        
    }
    
    
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
        
    int[]visited=new int[rooms.size()];
    
        visit(0,rooms,visited);
        
        for(int i=0;i<rooms.size();i++){
            
        if(visited[i]==0){
            return false;
        }
           
        }
        
        return true;
        
        
    }
}