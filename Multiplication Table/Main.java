import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int n,m,a,i;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      m=sc.nextInt();
      for(i=1;i<=m;i++)
      {
        a=i*n;
        System.out.println(+i+"*"+n+"="+a);
      }
      
    }
}