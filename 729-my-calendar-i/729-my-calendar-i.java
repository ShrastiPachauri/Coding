class MyCalendar {
List<List<Integer>> cal;
    public MyCalendar() {
        cal=new ArrayList<List<Integer>>();
        
    }
    
    public boolean book(int start, int end) {
        
        if(cal.size()==0)
        {
            List<Integer> l=new ArrayList<Integer>();
            l.add(start);
            l.add(end);
            cal.add(l);
            return true;
        }
        
        Collections.sort(cal,(a,b)->a.get(0)-b.get(0));
        for(List<Integer> x:cal)
        {
            if(x.get(0)<end && end<x.get(1) ||start>=x.get(0) && start<x.get(1)|| start<=x.get(0) && x.get(0)<end || x.get(1)>start && x.get(1)<end)
            {
                return false;
            }
        }
        List<Integer> l=new ArrayList<Integer>();
            l.add(start);
            l.add(end);
            cal.add(l);
        return true;
        
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */