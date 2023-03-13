import java.util.Scanner;
class Sec_Large_Array
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements in the array");
    int n = sc.nextInt();
    int A[] = new int[n];
    System.out.println("Enter the elements of array");
    int i,j,temp;
    for (i=0;i<n;i++)
      A[i]= sc.nextInt();
    for (i=0;i<n-1;i++)
    {
      for (j=0;j<n-i-1;j++)
      {
        if (A[j]>A[j+1])
        {
          temp = A[j];
          A[j] = A[j+1];
          A[j+1] = temp;
        }
      }
    }
    System.out.println("The second largest element is " + A[n-2]);
  }
}
