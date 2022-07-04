/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> ans=new ArrayList<Integer>();
        if(root!=null)
        {
           return func(root,ans);
        }
        else
        {
            return ans;
        }
    }
    
    List<Integer> func(Node root,List<Integer> ans)
    {
        ans.add(root.val);
        if(root.children.size()==0)
        {
            return ans;
        }
        
        for(int i=0;i<root.children.size();i++)
        {
           
            func(root.children.get(i),ans);
        }
        return ans;
    }
}