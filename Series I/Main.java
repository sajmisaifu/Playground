import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		int n,i,j;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      for(i=1;i<=n;i++)
      {
        j=i*i;
        
        System.out.printf("%d ",j);
      }
	}
}