import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        String type;
        int tution,bus,hostel;
        float total;
        Scanner sc=new Scanner(System.in);
        type=sc.nextLine();
        tution=sc.nextInt();
        bus=sc.nextInt();
        hostel=sc.nextInt();
        if(type.equalsIgnoreCase("MSDS"))
                               
        {
          total=tution+bus;
          System.out.printf("%.2f",total);
        }
      else if(type.equalsIgnoreCase("MSH"))
      {
        total=tution+hostel;
         System.out.printf("%.2f",total);
      }
      else if(type.equalsIgnoreCase("MGSDS"))
      {
        total=((150*tution)/100)+bus;
       System.out.printf("%.2f",total);
    }
     else if(type.equalsIgnoreCase("MGSH"))
     {
       total=((150*tution)/100)+hostel;
        System.out.printf("%.2f",total);
     }
    }
}