import java.util.Scanner;
class pal_scan
{
  public static void main(String args[])
  {
    int a,r,s=0,x;
    System.out.println("Enter a number");
    Scanner sc = new Scanner(System.in);
    a= sc.nextInt();
    x=a;
    while(x>0)
    {
      r=x%10;
      s=(s*10)+r;
      x=x/10;
    }
    if (s==a)
      System.out.println("Palindrome Number");
    else 
      System.out.println("Not a Palindrome Number");
  }
}
