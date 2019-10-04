import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int b,exp;
       Scanner sc=new Scanner(System.in);
      b=sc.nextInt();
      exp=sc.nextInt();
      System.out.println(Math.pow(b,exp));
    }
}