class Node 
{
    
    int key,val;
    Node prev,next;
    
    public Node(int _key,int _value)
    {
        key=_key;
        val=_value;
    }
    
    
}


class LRUCache {
HashMap<Integer,Node> hm=new HashMap<Integer,Node>();//to identify and access Node uniquely based on key
    
    Node head=new Node(0,0);
        Node tail=new Node(0,0);
       
    int Capacity;
    public LRUCache(int capacity) {
        Capacity=capacity;
         head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        
        
        if(hm.containsKey(key))
        {
            Node node=hm.get(key);
            //remove this node from the list ans insert at start
            remove(node);//freq operations
            insert(node);
            return node.val;
            
        }
        else
        {
            return -1;
        }
        
        
    }
    
    public void put(int key, int value) {
        
        if(hm.containsKey(key))
        {
            remove(hm.get(key));
        }
        Node node=new Node(key,value);//new node
      
        //insert at start;
        //check for capacity and availability of space
        if(hm.size()==Capacity)
        {
            //remove least recently used element
            remove(tail.prev);//node at last
        }
        insert(node);//insert in list
        
        
        
    }
    
    public void insert(Node node)
    {
      hm.put(node.key,node);
        Node headNext=head.next;
        
        head.next=node;
        node.prev=head;
        node.next=headNext;
        headNext.prev=node;
       
        
    }
    
    public void remove(Node node)
    {
        
        hm.remove(node.key);
        
        
        Node currentnext=node.next;
        
        node.prev.next=currentnext;
        currentnext.prev=node.prev;
        
    }
    
    
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */