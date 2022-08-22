class Solution {
    public int romanToInt(String s) {
        
        int sum=0;
        int i=0;
        int flg=0;
        for(i=0;i<s.length();)
        {
            if(i==s.length()-1)
            {
                flg=1;
                break;
            }
        
        if(s.charAt(i)=='C' && s.charAt(i+1)=='M')
        {
            sum+=900;
            i+=2;
        }
        else if(s.charAt(i)=='C' && s.charAt(i+1)=='D')
        {
            sum+=400;
             i+=2;
        }
        else if(s.charAt(i)=='X' && s.charAt(i+1)=='C')
        {
            sum+=90;
             i+=2;
        }
        else if(s.charAt(i)=='X' && s.charAt(i+1)=='L')
        {
            sum+=40;
             i+=2;
        }
        else if(s.charAt(i)=='I' && s.charAt(i+1)=='X')
        {
            sum+=9;
             i+=2;
        }
        else if(s.charAt(i)=='I' && s.charAt(i+1)=='V')
        {
            sum+=4;
             i+=2;
        }
        
        else if(s.charAt(i)=='M')
        {
            sum+=1000;
            i++;
        }
        else if(s.charAt(i)=='D')
        {
            sum+=500;
            i++;
        }
        else if(s.charAt(i)=='C')
        {
            sum+=100;
            i++;
        }
        else if(s.charAt(i)=='L')
        {
            sum+=50;
            i++;
        }
        else if(s.charAt(i)=='X')
        {
            sum+=10;
            i++;
        }
         else if(s.charAt(i)=='V')
        {
            sum+=5;
            i++;
        }
        else if(s.charAt(i)=='I')
        {
            sum+=1;
            i++;
        }
        }
        
        if(flg==1 && s.charAt(i)=='M')
        {
            sum+=1000;
           
        }
        else if(flg==1 && s.charAt(i)=='D')
        {
            sum+=500;
            
        }
        else if(flg==1 && s.charAt(i)=='L')
        {
            sum+=50;
            
        }
        else if(flg==1 && s.charAt(i)=='C')
        {
            sum+=100;
            
        }
        else if(flg==1 && s.charAt(i)=='V')
        {
            sum+=5;
            
        }
        else if(flg==1 && s.charAt(i)=='X')
        {
            sum+=10;
            
        }
        else if(flg==1 && s.charAt(i)=='I')
        {
            sum+=1;
           
        }
            
      
        return sum;
        }
        
      
    
}