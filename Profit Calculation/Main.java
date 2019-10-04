import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		int a,b,x,val,rs;
       Scanner sc=new Scanner(System.in);
       x=sc.nextInt();
      a=sc.nextInt();
      b=sc.nextInt();
     
      val=(x*a)-(x*b);
      rs=val-100;
      System.out.println("The profit obtained is Rs."+rs);
	}
}