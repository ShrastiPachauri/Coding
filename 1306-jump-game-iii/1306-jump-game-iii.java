class Solution {
    int dp[];
    public boolean f(int []arr,int index,int[]visited)
    { if(index>=arr.length || index<0 ||visited[index]==1)
        {
            return false;
        }
      
        if(dp[index]!=-1)
        {
            if(dp[index]==1)
            {
                return true;
            }
            return false;
        }
        if(arr[index]==0)
        {
            return true;
        }
       
        visited[index]=1;
        
        
        boolean a=f(arr,index+arr[index],visited);
        
        boolean b=f(arr,index-arr[index],visited);
        visited[index]=0;
     
     if((a||b)==true)
     {
         dp[index]=1;
     }
     else
     {
         dp[index]=0;
     }
        return a||b;
    }
    
    public boolean canReach(int[] arr, int start) {
        
        int visited[]=new int[arr.length];
        dp=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            dp[i]=-1;
        }
        for(int i=0;i<arr.length;i++)
        {
          visited[i]=0;
        }
        
        return f(arr,start,visited);
        
        
    }
}