/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder s=new StringBuilder();
        if(root==null){
            s.append("n ");
            return s.toString();
            
        }
        
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.add(root);
          s.append(root.val+" ");
        while(!q.isEmpty()){
            int size=q.size();
            
            for(int i=0;i<size;i++){
                
                TreeNode curr=q.poll();
              
                
                if(curr.left==null){
                    s.append("n ");
                }
                else{
                     s.append(curr.left.val+" ");
                    q.add(curr.left);
                }
                
                if(curr.right==null)s.append("n ");
                else{
                    s.append(curr.right.val+" ");
                    q.add(curr.right);
                }
               
            }
            
        }
        
        
        return s.toString();
        
        
        
        
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        
        
        String[]array=data.split(" ");
        
        Queue<TreeNode>q=new LinkedList<TreeNode>();
        
        if((array[0].equals("n")))return null;
        
        TreeNode root=new TreeNode(Integer.parseInt(array[0]));
        q.add(root);//root
        
        
        for(int i=1;i<array.length;i++){
            TreeNode curr=q.poll();
            if(!(array[i].equals("n"))){
                TreeNode left=new TreeNode(Integer.parseInt(array[i]));
                curr.left=left;
                q.add(left);
            }
            if(!(array[++i].equals("n"))){
                TreeNode right=new TreeNode(Integer.parseInt(array[i]));
                curr.right=right;
                q.add(right);
            }
            
            
        }
        
        return root;
        
        
        
        
        
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));