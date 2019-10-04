import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    int n,a,b,c,rev;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    a=n/100;
    b=n/10%10;
    c=n%10;
    rev=(c*100)+(b*10)+a;
    System.out.println(rev);
  }
}