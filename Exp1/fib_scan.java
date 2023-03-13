import java.util.Scanner;
class fib_scan
{
  public static void main(String args[])
  {
    int a=0,b=1,c=0,n,i;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    n = sc.nextInt();
    System.out.println(a);
    System.out.println(b);
    for (i=0;i<n-2;i++)
    {
      c=a+b;
      a=b;
      b=c;
      System.out.println(c);
    }
  }
}

