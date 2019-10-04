import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      int n,a,sum1=0,sum2=0;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
       while(n!=0)
       {
         a=n%10;
        
    
      if(a%2==0)
      {
        sum1=sum1+a;
        
      }
      else
      {
        sum2=sum2+a;
        
      }
         n=n/10;
       }
      if(sum1==sum2)
      {
        System.out.println("Yes");
      }
       else
       {
         System.out.println("No");
       }
    }  
}