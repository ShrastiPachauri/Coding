class Solution {
    public int trap(int[] height) {
        int trappedWater=0;
        
        int left[]=new int[height.length];
        
        int right[]=new int[height.length];
        
        int curr=height[0];
        for(int i=0;i<height.length;i++)//left greater for each index
        {
            if(height[i]>curr)curr=height[i];
            left[i]=curr;
            
        }
        curr=height[height.length-1];
        
        for(int i=height.length-1;i>=0;i--)//right greater for each index
        {
            if(height[i]>curr)curr=height[i];
            right[i]=curr;
            
        }
        
        
        for(int i=0;i<height.length;i++)
        {
          
        
        trappedWater+=((int)Math.min(left[i],right[i])-height[i]);
        
        
        }
        return trappedWater;
    }
}