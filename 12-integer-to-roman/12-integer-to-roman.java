class Solution {
    public String intToRoman(int num) {
       
       
        StringBuilder s=new StringBuilder();
        while(num>0)
        {
        if(num>=1000)
        {
            int x=num/1000;
            num=num%1000;
           for(int i=0;i<x;i++)
           {
               s.append("M");
           }
            
        }
        else if(num>=900)
        {
            int x=num/900;
            num=num%900;
           for(int i=0;i<x;i++)
           {
               s.append("CM");
           }
            
        }
        else if(num>=500)
        {
            int x=num/500;
             num=num%500;
           for(int i=0;i<x;i++)
           {
               s.append("D");
           }
            
        }
        else if(num>=400)
        {
            int x=num/400;
            num=num%400;
           for(int i=0;i<x;i++)
           {
               s.append("CD");
           }
            
        }
        else if(num>=100)
        {
            int x=num/100;
            num=num%100;
           for(int i=0;i<x;i++)
           {
               s.append("C");
           }
            
        }
        else if(num>=90)
        {
            int x=num/90;
            num=num%90;
           for(int i=0;i<x;i++)
           {
               s.append("XC");
           }
            
        }
        else if(num>=50)
        {
            int x=num/50;
            num=num%50;
           for(int i=0;i<x;i++)
           {
               s.append("L");
           }
            
        }
         else if(num>=40)
        {
            int x=num/40;
            num=num%40;
           for(int i=0;i<x;i++)
           {
               s.append("XL");
           }
            
        }
        else if(num>=10)
        {
            int x=num/10;
             num=num%10;
           for(int i=0;i<x;i++)
           {
               s.append("X");
           }
            
        }
         else if(num>=9)
        {
            int x=num/9;
             num=num%9;
           for(int i=0;i<x;i++)
           {
               s.append("IX");
           }
            
        }
        else if(num>=5)
        {
            int x=num/5;
             num=num%5;
           for(int i=0;i<x;i++)
           {
               s.append("V");
           }
            
        }
        else if(num>=4)
        {
            int x=num/4;
             num=num%4;
           for(int i=0;i<x;i++)
           {
               s.append("IV");
           }
            
        }
        else if(num>=1)
        {
            int x=num/1;
             num=num%1;
           for(int i=0;i<x;i++)
           {
               s.append("I");
           }
            
        }
        
        
        
    }
        
        
        
       return s.toString(); 
    }
}
