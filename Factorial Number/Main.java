import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int n,fact=1,i;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      int f=0;
      for( i=1;i<=n;i++)
      {
       
        fact=fact*i;
        if(fact==n)
        {
          f=1;
        }
      }
      
       if(f==1)
       {
          System.out.println("Yes");
       }
      else
      {
         System.out.println("No");
      }
    }
}