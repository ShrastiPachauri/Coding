class Solution {
    public int[][] merge(int[][] intervals) {
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);//sorted intervals
        int start=intervals[0][0];
        int end=intervals[0][1];
        
        
        for(int i=1;i<intervals.length;i++)
        {
            if(end>=intervals[i][0])//merger condition
            {
                end=(int)Math.max(end,intervals[i][1]);
            }
            else
            {
            ans.add(new ArrayList<Integer>(Arrays.asList(start,end)));
            
            start=intervals[i][0];
                end=intervals[i][1];
            
                }
        }
       
         ans.add(new ArrayList<Integer>(Arrays.asList(start,end)));//b/c is no matter if 
        int [][]answer=new int[ans.size()][2];
        int i=0;
        for(List<Integer> x:ans)
        {
            answer[i][0]=x.get(0);
            answer[i][1]=x.get(1);
            
            i++;
        }
        
        
        
        
        
        
        return answer;
        
        
        
        
        
        
        
        
        
        
        
        
    }
}