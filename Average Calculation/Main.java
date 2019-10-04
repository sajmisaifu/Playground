import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       int n;
        float sum=0, average;
        Scanner s = new Scanner(System.in);
        //n = s.nextInt();
        int a[] = new int[5];
       for(int i = 0; i < 5 ; i++)
        {
            a[i] = s.nextInt();
            sum = sum + a[i];
        }
       average = sum / 5;
      System.out.println(average);
    }
}