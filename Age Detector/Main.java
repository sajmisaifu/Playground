import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int a,b,age,x;
      
      Scanner sc=new Scanner(System.in);
      a=sc.nextInt();
      b=sc.nextInt();
      if(b>a)
      {
        age=b-a;
        System.out.println(age);
      }
       else if(b<a)
       {
         x=100-a;
         age=x+b;
          System.out.println(age);
       }
    }
}