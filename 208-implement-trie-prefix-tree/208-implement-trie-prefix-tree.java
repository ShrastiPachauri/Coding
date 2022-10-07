class Node{
    
    Node[]links=new Node[26];
    boolean flag=false;//not an end
 
    
    public boolean containsKey(char c)
    {
        return links[c-'a']!=null;
    }
    public Node get(char c){
        return links[c-'a'];
    }
    
    public void put(char c,Node n){
        links[c-'a']=n;
    }
    
}


class Trie {
Node root;
    public Trie() {
        root=new Node();
    }
    
    public void insert(String word) {
        Node nd=root;
        for(int i=0;i<word.length();i++){
            if(nd.get(word.charAt(i))!=null){
                
                nd=nd.get(word.charAt(i));
            }
            else
            {
                nd.put(word.charAt(i),new Node());
                nd=nd.get(word.charAt(i));
            }
            
        }
        nd.flag=true;
    }
    
    public boolean search(String word) {
        Node nd=root;
        
        for(int i=0;i<word.length();i++){
            
            if(nd.get(word.charAt(i))!=null){
                
                nd=nd.get(word.charAt(i));
            }
            else
            {
                return false;
            }
            
        }
        
        if(nd.flag==true)return true;
        return false;
        
        
    }
    
    public boolean startsWith(String prefix) {
        
        Node nd=root;
        
        for(int i=0;i<prefix.length();i++){
            
            if(nd.get(prefix.charAt(i))!=null){
                
                nd=nd.get(prefix.charAt(i));
            }
            else
            {
                return false;
            }
           
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */