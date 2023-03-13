import java.util.Scanner;
class sum_scan
{
  public static void main(String args[])
  {
    int a,b,sum;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 1st number");
    a = sc.nextInt();
    System.out.println("Enter 2nd number");
    b = sc.nextInt();
    sum = a+b;
    System.out.println("The sum is " + sum);
  }
}
