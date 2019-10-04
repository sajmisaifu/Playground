import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int L1,L2,L3,x,y,z;
      String a;
      Scanner sc=new Scanner(System.in);
      x=sc.nextInt();
      y=sc.nextInt();
      z=sc.nextInt();
      a=sc.nextLine();
      
        if((x>y)&&(x<z))
        {
           System.out.println("L1");
        }
      else if((y>x)&&(y<z))
      {
         System.out.println("L2");
      }
      else if((z>x)&&(z<y))
      {
         System.out.println("L3");
      }
      
    }
}