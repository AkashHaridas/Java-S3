import java.util.Scanner;
class fac_scan
{
  public static void main(String args[])
  {
    int a,fac=1,i;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    a = sc.nextInt();
    for (i=1;i<=a;i++)
      fac=fac*i;
    System.out.println("The factorial is " + fac);
  }
}
