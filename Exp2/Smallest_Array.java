import java.util.Scanner;
class Smallest_Array
{
  public static void main(String args[])
  {
    int min,i,n;
    System.out.println("Enter the number of elements in the array");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    int A[]=new int[n];
    System.out.println("Enter the elements of array");
    for(i=0;i<n;i++)
      A[i]=sc.nextInt();
    min = A[0];
    for(i=1;i<n;i++)
      if (A[i]<min)
        min = A[i];
    System.out.println("The smallest element in the array is " + min);
  }
}
