import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int p,n;
        float r,interest;
        p=sc.nextInt();
      n=sc.nextInt();
      r=sc.nextFloat();
      interest=(p*n*r)/100;
      System.out.println(interest);
    }
}