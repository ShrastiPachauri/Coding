class Solution {
    
    public int totalFruit(int[] fruits) {
        
       
        int l=0;
        int t1=-1,t2=-1;
        int c1=0,c2=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<fruits.length;i++){
            
            if(t1==-1){//t1 type not specified
                t1=fruits[i];
                c1++;
                
                
            }
            else if(t2==-1 && fruits[i]!=t1){//t2 type not specified
                t2=fruits[i];
                c2++;
            }
            else{
                
                if(fruits[i]!=t1 && fruits[i]!=t2){//third type disc
                    if(max<(c1+c2))max=c1+c2;
                    while(c1!=0 && c2!=0 ){
                        if(fruits[l]==t1)c1--;
                        if(fruits[l]==t2)c2--;
                       //start of new window
                        l++;
                    }
                    //System.out.println("l is "+l+"c1 is "+c1+" c2 is "+c2);
                    if(c1==0){
                        t1=fruits[i];
                        c1++;
                    }
                    else if(c2==0){
                        t2=fruits[i];
                        c2++;
                        
                    }
                    
                }
                else{
                if(fruits[i]==t1)c1++;
                else if(fruits[i]==t2)c2++;
                }
                
            }

        }
         if(max<(c1+c2))max=c1+c2;
        
        return max;
        
        
        
        
    }
}