import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int x,y;
      Scanner sc=new Scanner(System.in);
      x=sc.nextInt();
      y=sc.nextInt();
      if(x==y)
      {
        System.out.println(+x+" and " +y+ " are equal");
      }
        else if(x>y)
        {
           System.out.println(+x+" greater than " +y);
          
          
        }
          else if(x<y)
          {
             System.out.println(+x+ " less than "+y);
          }
        
      
    }
}