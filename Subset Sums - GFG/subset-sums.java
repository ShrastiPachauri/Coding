//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i = 0; i < N ; i++){
			    arr.add(sc.nextInt());
			}
            Solution ob = new Solution();
         
            ArrayList<Integer> ans = ob.subsetSums(arr,N);
            Collections.sort(ans);
            for(int sum : ans){
                System.out.print(sum+" ");
            }
            System.out.println();
        }  
    }
}

// } Driver Code Ends


//User function Template for Java//User function Template for Java
class Solution{
    
    public void findSum(ArrayList<Integer> arr,int index,ArrayList<Integer> ans,int sum){
        
        if(index>=arr.size()){
            
           ans.add(sum);
           return;
            
        }
        
        //take or nat take
       
        findSum(arr,index+1,ans,sum+arr.get(index));
        
        findSum(arr,index+1,ans,sum+0);
        
        
        
    }
    
    
    
    
    
    
    
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        
        ArrayList<Integer> ans=new ArrayList<Integer>();
        
        findSum(arr,0,ans,0);
        return ans;
        // code here
    }
}