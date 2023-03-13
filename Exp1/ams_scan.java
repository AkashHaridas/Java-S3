import java.util.Scanner;
class ams_scan
{
  public static void main(String args[])
  {
    int a,i,r,s=0,x;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    a = sc.nextInt();
    x=a;
    while (x!=0)
    {
      r = x%10;
      s = s + (r*r*r);
      x = x/10;
    }
    if(s==a)
      System.out.println("The number is Amstrong");
    else
      System.out.println("The number is not Amstrong");
  }
}
