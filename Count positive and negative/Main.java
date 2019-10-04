import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int n,i,a=0,b=0,c;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
     
     for(i=0;i<n;i++)
     {
       c=sc.nextInt();
       if(c>=0)
       {
         a++;
       }
       else if(c<0)
       {
         b++;
       }
      
    }
       System.out.println("Number of positive numbers is "+a+" and the number of negative numbers is "+b);
    }
}