import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int L1,L2,L3,x,y,z;
      Scanner sc=new Scanner(System.in);
      x=sc.nextInt();
      y=sc.nextInt();
      z=sc.nextInt();
      if((x<y)&&(x<z))
      {
         System.out.println("L1");
      }
      else if((y<x)&&(y<z))
      {
         System.out.println("L2");
      }
      else if((z<x)&&(z<y))
      {
         System.out.println("L3");
      }
    }
}