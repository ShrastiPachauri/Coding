class Solution {

   public void partition(String s,int index,List<String> path,List<List<String>> ans){
       if(index==s.length()){
           List<String> l=new ArrayList<String>(path);
           ans.add(l);
           return;
       }
       for(int i=index;i<s.length();i++){
           if(isPalindrome(s,index,i)){
               path.add(s.substring(index,i+1));
               partition(s,i+1,path,ans);
               path.remove(path.size()-1);
           }
           
       }
      
   }
    
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<List<String>>();
        List<String> path=new ArrayList<String>();
        partition(s,0,path,ans);
        return ans;
    }
    
    public boolean isPalindrome(String s,int start,int end){
        
        while(start<=end){
            if(s.charAt(start++)!=s.charAt(end--))return false;
        }
        return true;
    }
}