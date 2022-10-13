//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}

class GfG {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int w = Integer.parseInt(inputLine[1]);
            Item[] arr = new Item[n];
            inputLine = br.readLine().trim().split(" ");
            for(int i=0, k=0; i<n; i++){
                arr[i] = new Item(Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]));
            }
            System.out.println(String.format("%.2f", new Solution().fractionalKnapsack(w, arr, n)));
        }
    }
}
// } Driver Code Ends


/*
class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
*/

class comp implements Comparator<I>{
    
    
    public int compare(I a ,I b){
        
        if(a.cost>b.cost)return -1;
        else if(a.cost<b.cost)return 1;
        else return 0;
          
        
        
        
    }
    
    
    
    
    
}








class I{
    
    Item it;
    double cost;
    
    I(Item it,double cost){
        this.it=it;
        this.cost=cost;
        
        
    }
    
}

class Solution
{
    //Function to get the maximum total value in the knapsack.
    
    double fractionalKnapsack(int W, Item arr[], int n) 
    { 
    List<I> items=new ArrayList<I>();
    for(int i=0;i<arr.length;i++){
        double cost=(arr[i].value*1.0)/arr[i].weight;
        items.add(new I(arr[i],cost));
    }
    
    Collections.sort(items,new comp());
        double profit=0;
        for(I item:items){
            if(W==0)break;
           if(item.it.weight<=W){
               W-=item.it.weight;
               profit+=item.it.weight*item.cost;
           }
           else{
               profit+=(W*item.cost);
               W=0;
               
           }
            
        }
        return profit;
        
        
        
        
        
    }
}