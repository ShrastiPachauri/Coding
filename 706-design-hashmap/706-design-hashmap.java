class MyHashMap {
ArrayList<Integer> Key;
    ArrayList<Integer> values;
    public MyHashMap() {
        Key=new ArrayList<Integer>();
        values=new ArrayList<Integer>();
        
    }
    
    public void put(int key, int value) {
        Integer x=key;
       int in= Key.indexOf(x);
       // System.out.println("index of "+key+" "+in);
        if(in>=0)
        {
            values.set(in,value);//replace old value
        }
        else
        {
        Key.add(key);
        values.add(value);
        }
        
        //System.out.println("values in Key ArrayList "+Key);
    }
    
    public int get(int key) {
       int in= Key.indexOf(new Integer(key));
        if(in>=0)
        {
        return values.get(in);
        }
        else
            return -1;
    }
    
    public void remove(int key) {
        int in= Key.indexOf(key);
        if(in>=0)
        {
        values.remove(in);
        Key.remove(in);
    }
    }    
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */