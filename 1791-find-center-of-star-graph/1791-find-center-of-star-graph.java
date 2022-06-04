class Solution {
    
    HashSet<Integer> hs=new HashSet<Integer>();  
    public int findCenter(int[][] edges) {
        
        for(int i=0;i<edges.length;i++)
        {
            
            if(hs.contains(edges[i][0]))
            {
                return edges[i][0];
            }
             hs.add(edges[i][0]);
            if(hs.contains(edges[i][1]))
            {
                return edges[i][1];
            }
            
           
            hs.add(edges[i][1]);
        }
        return -1;
    }
}