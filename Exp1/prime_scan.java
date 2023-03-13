import java.util.Scanner;
class prime_scan
{
  public static void main(String args[])
  {
    int a,c=0,i;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    a = sc.nextInt();
    if (a==1)
      System.out.println("Neither prime nor composite");
    else if (a==2)
      System.out.println("Prime number");
    else if (a>2)
      {
        for(i=2;i<a;i++)
          if (a%i == 0)
            c++;
      }
    if (c == 0)
      System.out.println("Prime Number");
    else 
      System.out.println("Not a prime number");
  }
}
