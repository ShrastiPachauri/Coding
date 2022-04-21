class MyHashSet {
ArrayList<Integer> store;
    public MyHashSet() {
        store=new ArrayList<Integer>();
    }
    
    public void add(int key) {
        
        
        if(!store.contains(key))
        {
            store.add(key);
        }
        
        Collections.sort(store);
        
    }
    
    public void remove(int key) {
        
        if(store.contains(key))
        {
             store.remove(new Integer(key));      
        }
         
        
    }
    
    public boolean contains(int key) {
        
        return store.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */