import java.util.*;
class Multiply_Matrix
{
  public static void main(String args[])
  {
    int i,j,k;
    int a[][] = new int[10][10];
    int b[][] = new int[10][10];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter order of first matrix");
    int m = sc.nextInt();
    int n = sc.nextInt();
    System.out.println("Enter order of second matrix");
    int p = sc.nextInt();
    int q = sc.nextInt();
    System.out.println("Enter the elements of the first matrix");
    for (i=0;i<m;i++)
      for (j=0;j<n;j++)
        a[i][j] = sc.nextInt();
    System.out.println("Enter the elements of the second matrix");
    for (i=0;i<p;i++)
      for (j=0;j<q;j++)
        b[i][j] = sc.nextInt();
    int r[][] = new int[m][q];
    if (n==p)
    {
      for (i=0;i<m;i++)
      {
        for (j=0;j<q;j++)
        {
          r[i][j] = 0;
          for(k=0;k<n;k++)
          {
            r[i][j] = r[i][j] + a[i][k]*b[k][j];
          }
        }
      }
      System.out.println("Result is :");
      for (i=0;i<m;i++)
      {
        for (j=0;j<q;j++)
        {
          System.out.print(r[i][j] + "\t");
        }
        System.out.print("\n");
      }
    }
    else
      System.out.println("Matrix MUltiplication is not possible");
  }
}
