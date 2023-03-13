import java.util.Scanner;
class factors_scan
{
  public static void main(String args[])
  {
    int a,i;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    a = sc.nextInt();
    for (i=1;i<=a;i++)
      if (a%i == 0)
        System.out.println(i);
   }
}
