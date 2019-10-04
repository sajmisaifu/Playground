import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       int L1,L2,L3,x,y,z,a,n;
       Scanner sc=new Scanner(System.in);
      x=sc.nextInt();
      y=sc.nextInt();
      z=sc.nextInt();
      a=sc.nextInt();
      int i=0;
      if((a>x)&&(a>y)&&(a>z))
           {
              System.out.println("0");
           }
         else
         {
        if(a<x)
        {
          i++;
        }
          if(a<y)
          {
            i++;
          }
            if(a<z)
            {
              i++;
            }
               System.out.println(i);
         }
          
        
             
             
             
        
      }
    }
