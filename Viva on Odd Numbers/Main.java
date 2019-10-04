import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       float mark=0.0f;
      int n,c=0;
      Scanner s=new Scanner(System.in);
     
      do
      {
        n=s.nextInt();
       
         if(n<0)
         {
         mark=(float)(mark-1.0);
       }
      else if( n%2==1)
       {
        mark++;
        c++;
      }
     
   else
       {
     mark=(float)(mark-0.5);
   }
      }
      while(n>0 && c!=3);
     
      System.out.printf("%.1f",mark);
    }
}