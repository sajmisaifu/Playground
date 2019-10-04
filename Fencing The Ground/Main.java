import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int l,b;
    l=sc.nextInt();
    b=sc.nextInt();
    int p,a;
    p=2*(l+b);
    a=l*b;
    System.out.println(p+"m");
    System.out.println(a+"sqm");
  }
}