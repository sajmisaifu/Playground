import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      int c=0,sq,q1,r1,temp,i=0,var=0,sum=0;
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
       sq=n*n;
      temp=sq;
       while(sq!=0)
       {
        sq=sq/10;
         c++;
       }
      sq=temp;
      if(c==2)
        {
          q1=sq/10;
          r1=sq%10;
           sum=q1+r1;
        if(sum==n)
          System.out.println("Kaprekar Number");
        else
           System.out.println("Not A Kaprekar Number");
        }
      else if(c>2)
      {    
      do
      {
        sq=sq/100;
        i++;        
      }while(i!=1);
        var=temp;
        var=var%1000;
        sum=sq+var;
        if(sum==temp)
          System.out.println("Kaprekar Number");
        else
           System.out.println("Not A Kaprekar Number");
      }
    }
}