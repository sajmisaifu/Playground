import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int n,m,a,b,sum,prd,c;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      m=sc.nextInt();
      for(int i=n;i<=m;i++)
      {
        a=i%10;
        b=i/10;
        sum=a+b;
        prd=a*b;
        c=sum+prd;
        if(c==i)
        {
          System.out.println(i);
        }
    }
}
}