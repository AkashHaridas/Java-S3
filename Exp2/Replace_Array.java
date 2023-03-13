import java.util.Scanner;
class Replace_Array
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements of the array");
    int n = sc.nextInt();
    int A[] = new int[n];
    System.out.println("Enter the elements of array");
    int i;
    for (i=0;i<n;i++)
      A[i] = sc.nextInt();
    System.out.println("Enter the position to be replaced");
    int c = sc.nextInt();
    System.out.println("Enter the new element to be placed");
    int x = sc.nextInt();
    A[c-1] = x;
    System.out.println("New array:");
    for (i=0;i<n;i++)
      System.out.println(A[i]);
  }
}
