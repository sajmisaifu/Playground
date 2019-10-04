import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num;
      String n;
        num=sc.nextInt();
      n=(num%2==0)?"Even":"Odd";
      System.out.println(n);
    }
}