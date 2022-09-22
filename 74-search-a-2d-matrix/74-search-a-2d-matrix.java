class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    int row=-1;
for(int i=0;i<matrix.length;i++){
if(matrix[i][matrix[0].length-1]>= target){
row=i;
break;
}
}
if(row==-1)return false;//row not found
int low=0;
int high=matrix[0].length-1;
int mid=low +(high-low)/2;
while(low<=high){

 mid=low +(high-low)/2;
if(matrix[row][mid]==target){
return true;

}
else if(matrix[row][mid]>target)
{
high=mid-1;

}
else
{
low=mid+1;
}
}
        return false;
}

}