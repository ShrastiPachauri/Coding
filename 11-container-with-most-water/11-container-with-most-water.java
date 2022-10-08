class Solution {
    public int maxArea(int[] height) {
        
       
       
        int l=0;
        int h=height.length-1;
        int max_area=Integer.MIN_VALUE;
        
        while(l<h){
            
            int area=(h-l)*(int)Math.min(height[l],height[h]);
            if(area>max_area)max_area=area;
            
            if(height[l]<height[h]){
                l++;
            }
            else{
                h--;
            }
            
        }
        
         
        
        return max_area;
    }
}