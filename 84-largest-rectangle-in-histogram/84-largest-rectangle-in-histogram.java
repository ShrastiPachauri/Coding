class Solution {
    public int largestRectangleArea(int[] height) {
int[]left=new int[height.length];
int[]right=new int[height.length];

Stack<Integer> st=new Stack<Integer>();

for(int i=0;i<height.length;i++){

while(!st.isEmpty() && height[st.peek()]>=height[i]){
st.pop();
}
if(st.isEmpty()){
left[i]=-1;
st.push(i);
}
else
{
left[i]=st.peek();
st.push(i);
}




}
st.clear();
//right min to height[i]
for(int i=height.length-1;i>=0;i--){

while(!st.isEmpty() && height[st.peek()]>=height[i]){
st.pop();
}

if(st.isEmpty()){
right[i]=height.length;
st.push(i);
}
else
{
right[i]=st.peek();
st.push(i);
}


}

//max area 
int max_area=Integer.MIN_VALUE;
for(int i=0;i<height.length;i++){
int area=(int)Math.abs(right[i]-left[i]-1)*height[i];
max_area=area>max_area?area:max_area;


}
        return max_area;
    }
}


    
