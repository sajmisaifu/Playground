import java.util.Scanner;
class Main
{
public static void main(String args[])
{
  int a,b,std,left;
  Scanner sc=new Scanner(System.in);
  a=sc.nextInt();
  b=sc.nextInt();
  std=a/b;
  left=a%b;
  System.out.println("The number of students in each team is " +std+ " and left out is "+left);
  
}
}