import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int n,a=0,b=0,c=1,curr=0;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      System.out.print(a+" ");
      System.out.print(b+" ");
           System.out.print(c+" ");
      for(int i=3;i<n;i++)
          {
            curr=a+b+c;
             System.out.print(curr+" ");
        int temp=c;
        c=curr;
        a=b;
        b=temp;
            
      }
       
    }
}