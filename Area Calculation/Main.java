import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,sqr,rect;
       float r;
      double circle;
       a=sc.nextInt();
       b=sc.nextInt();
       c=sc.nextInt();
       r=sc.nextFloat();
       sqr=a*a;
       rect=b*c;
      circle=3.14*r*r;
      System.out.println(sqr);
      System.out.println(rect);
      System.out.println(circle);
     
    }
}