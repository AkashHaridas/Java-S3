import java.util.*;
class Sum_Array
{
  public static void main(String args[])
  {
    int i;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements");
    int n = sc.nextInt();
    int A[] = new int[n];
    System.out.println("Enter the array elements");
    for (i=0; i<n; i++)
      A[i] = sc.nextInt();
    int sum=0;
    for (i=0; i<n; i++)
      sum = sum + A[i];
    System.out.println("The sum of all the elements of array = " + sum);
  }
}
