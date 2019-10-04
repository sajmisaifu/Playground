import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       int L1,L2,L3,x,y,z,a;
      Scanner sc=new Scanner(System.in);
      x=sc.nextInt();
      y=sc.nextInt();
      z=sc.nextInt();
      a=sc.nextInt();
      if(a<z)
      {
         System.out.println("L3");
      }
      else if(a<y)
      {
         System.out.println("L2");
      }
      else
      {
         System.out.println("L1");
      }
    
}
}