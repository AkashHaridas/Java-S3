import java.util.*;
class Add_Matrix
{
  public static void main(String args[])
  {
    int a[][] = new int[10][10];
    int b[][] = new int[10][10];
    int r[][] = new int[10][10];
    int i,j;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of rows in first matrix");
    int m = sc.nextInt();
    System.out.println("Enter number of columns in first matrix");
    int n = sc.nextInt();
    System.out.println("Enter number of rows in second matrix");
    int p = sc.nextInt();
    System.out.println("Enter number of columns in second matrix");
    int q = sc.nextInt();
    if(m==p && n==q)
    {
      System.out.println("Enter the first matrix");
      for(i=0;i<m;i++)
      {
        for(j=0;j<n;j++)
        {
          a[i][j] = sc.nextInt();
        }
      }
      System.out.println("Enter the second matrix");
      for(i=0;i<p;i++)
      {
        for(j=0;j<q;j++)
        {
          b[i][j] = sc.nextInt();
        }
      }
      for(i=0;i<m;i++)
      {
        for(j=0;j<n;j++)
        {
          r[i][j] = a[i][j] + b[i][j];
        }
      }
      System.out.println("Result is \n");
      for(i=0;i<m;i++)
      {
        for(j=0;j<n;j++)
        {
          System.out.print(r[i][j] + "\t");
        }
        System.out.print("\n");
      }
    }
    else
      System.out.println("Addition not possible");
  }
}
