class Solution {
    public int maxPoints(int[][] points) {
       HashMap<Double,Integer> h=new HashMap<Double,Integer>();
        
    double slope=0;
        int max_num=0;
        for(int i=0;i<points.length;i++)
        {
            
            for(int j=0;j<points.length ;j++)
            {
                if(j==i)
                {
                    continue;
                }
            int x=points[i][0]-points[j][0];
             int y=points[i][1]-points[j][1];
            
            slope=(y/(x*1.0));
            h.put(slope,h.getOrDefault(slope,0)+1);
                if(h.get(slope)>max_num)
                {
                    max_num=h.get(slope);
                }
            
             }
            
          
            h.clear();
        }
       return max_num+1;
    }
}