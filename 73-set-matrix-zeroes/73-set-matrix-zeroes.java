class Solution {
    public void setZeroes(int[][] matrix) {
        //row0 to mark cols
boolean row0=false;
boolean col0=false;
//col0 to mark rows
//1 0 0
//1 0 0
//0 0 0
for(int i=0;i<matrix.length;i++){
  for(int j=0;j<matrix[0].length;j++){
if(matrix[i][j]==0)
{
if(i==0)row0=true;
if(j==0)col0=true;
matrix[0][j]=0;//mark col j to be 0
matrix[i][0]=0;//mark row i to be 0

}
}
}
for(int i=1;i<matrix[0].length;i++){
if(matrix[0][i]==0){  //mark that col i as 0 ,exceptt col0
  for(int j=0;j<matrix.length;j++){
matrix[j][i]=0;
}
}
}

for(int i=1;i<matrix.length;i++){
  if(matrix[i][0]==0){//row i mark it zero
for(int j=0;j<matrix[0].length;j++){
matrix[i][j]=0;
}
}
}

if(col0){
for(int i=0;i<matrix.length;i++){
matrix[i][0]=0;
}
}
        
        
        if(row0){
for(int i=0;i<matrix[0].length;i++){
matrix[0][i]=0;
}
}


    }
}