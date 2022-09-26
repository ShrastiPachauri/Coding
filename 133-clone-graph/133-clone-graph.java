/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    
    public void clone(Node node,Node copied,Node[]visited){
        
        if(visited[node.val]==null){
            
            visited[node.val]=copied;
        }
        
        for(int i=0;i<node.neighbors.size();i++){
            
            if(visited[node.neighbors.get(i).val]==null){
            Node newNode=new Node(node.neighbors.get(i).val);
            copied.neighbors.add(newNode);
            clone(node.neighbors.get(i),newNode,visited);
            }
            else
            {
                copied.neighbors.add(visited[node.neighbors.get(i).val]);
            }
        }
        
        
        
    }
    
    public Node cloneGraph(Node node) {
        if(node==null)return null;
        Node copied=new Node(node.val);
        Node visited[]=new Node[101];
        Arrays.fill(visited,null);
        clone(node,copied,visited);
        
        return copied;
        
        
        
    }
}