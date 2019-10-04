import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
         Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int a=0,i=0,b=0;
      while(n!=0)
      {
        n=n/10;
          i++;
      }
      if(i==3)
      {
        a=((n/100)%10);
        b=a%3;
        if(b==0)
      {
        System.out.println("Trendy Number");
      }
       
      
      }
     else
      {
         System.out.println("Not a Trendy Number");
      }
     
      
      
    }
}