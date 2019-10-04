import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int a,b,temp;
      Scanner sc=new Scanner(System.in);
      a=sc.nextInt();
      b=sc.nextInt();
     // temp=sc.nextInt();
      temp=a;
      a=b;
      b=temp;
      System.out.println(a);
      System.out.println(b);
      
    }
}