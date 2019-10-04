import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       int n;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      int i=0,c;
      int sum=0;
      do
      {
        c=sc.nextInt();
        sum=sum+c;
        i++;
      }
      while(sum<n);
      System.out.println("The number of turns is " +i);
    }
}