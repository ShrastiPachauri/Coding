//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}

class GfG {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //testcases
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
            String inputLine[] = br.readLine().trim().split(" ");
            
            //size of array
            int n = Integer.parseInt(inputLine[0]);
            Job[] arr = new Job[n];
            inputLine = br.readLine().trim().split(" ");
            
            //adding id, deadline, profit
            for(int i=0, k=0; i<n; i++){
                arr[i] = new Job(Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]));
            }
            
            Solution ob = new Solution();
            
            //function call
            int[] res = ob.JobScheduling(arr, n);
            System.out.println (res[0] + " " + res[1]);
        }
    }
}
// } Driver Code Ends


class comp implements Comparator<Job>{
    
    public int compare(Job a,Job b){
        
        if(a.profit>b.profit)return -1;
        else if(a.profit<b.profit)return 1;
        else{
            
            if(a.deadline>b.deadline)return -1;
            else if(a.deadline<b.deadline)return 1;
            else return 0;
        }
        
        
        
    }
    
}

class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    
    int[] JobScheduling(Job arr[], int n)
    {
        int time=0;
        for(Job x:arr){
            if(x.deadline>time)time=x.deadline;
        }
        int profit=0;
        int jobs=0;
        int[]deadline=new int[time];
        Arrays.sort(arr,new comp());
        
        for(int i=0;i<arr.length;i++){
            
            int t=arr[i].deadline-1;//8 e.g
            while(t>=0 && deadline[t]!=0){
                t--;
            }
            if(t>=0)
            {deadline[t]=arr[i].id;//jobid
            profit+=arr[i].profit;
            jobs++;
            }
            
        }
        int[]ans=new int[2];
        ans[0]=jobs;
        ans[1]=profit;
        return ans;
    }
}

/*
class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}
*/