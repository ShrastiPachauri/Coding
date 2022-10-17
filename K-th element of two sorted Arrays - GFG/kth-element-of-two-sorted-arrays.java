//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            int n = Integer.parseInt(stt.nextToken());
            int m = Integer.parseInt(stt.nextToken());
            int k = Integer.parseInt(stt.nextToken());
            int a[] = new int[(int)(n)];
            int b[] = new int[(int)(m)];
            
            
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                b[i] = Integer.parseInt(inputLine1[i]);
            }
            
            
            Solution obj = new Solution();
            System.out.println(obj.kthElement( a, b, n, m, k));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
       
        int l=0,r=0;
        int cnt=0;
        int curr=-1;
        if(k>(arr1.length+arr2.length))return -1;
        
        PriorityQueue<Integer>elements=new PriorityQueue<Integer>(Collections.reverseOrder());
        int i=0;//pointers to arra1
        int j=0;//---to arr2
        while(i<arr1.length && j<arr2.length){
           
            if(arr1[i]<arr2[j]){
                 elements.add(arr1[i]);
                 i++;
            }
            else{
                elements.add(arr2[j]);
            j++;
                
            }
            if(elements.size()==k){
                return elements.poll();
            }
            
        }
        if(i<arr1.length){
            while(elements.size()!=k){
                elements.add(arr1[i]);
                i++;
            }
        }
        if(j<arr2.length){
            while(elements.size()!=k){
                elements.add(arr2[j]);
                j++;
            }
        }
        
        
        
        return elements.poll();
        
        
    }
}