import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       int a,b;
      Scanner sc=new Scanner(System.in);
      a=sc.nextInt();
      b=sc.nextInt();
      while(a>=b)
      {
        System.out.println(a);
        a--;
      }
    }
}