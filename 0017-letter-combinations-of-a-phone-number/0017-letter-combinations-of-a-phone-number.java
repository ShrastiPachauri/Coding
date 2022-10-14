class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<String>();
        if(digits.length()<1)return ans;
        
        String[]keys={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
       
        
        int[] number=new int[digits.length()];//length of string ,no.of digits
        int num=Integer.parseInt(digits);
        int index=number.length-1;
        while(num>0){
            
           
            number[index]=num%10;
            index--;
            num=num/10;
        }
        
        
        
        for(int i=0;i<number.length;i++){
            char[]arr=keys[number[i]-2].toCharArray();//all chars at given string 
            
            if(ans.size()==0){//first digit
                for(char x:arr){
                    ans.add(x+"");
                }
                continue;
            }
            List<String>temp=new ArrayList<String>(ans);//current list status
           for(int j=0;j<arr.length;j++){//all possible char
               
             for(int k=0;k<temp.size();k++){//asll available char in list
                 
                 String s=temp.get(k);
                 s=s+arr[j];
                 ans.add(s);
             }
               
           }
            
        if(ans.size()>temp.size())
        { 
            int x=temp.size();
            
            while(x-->0){
                ans.remove(0);
            }
            
    
        }
        }
      
        
        return ans;
        
        
        
    }
}