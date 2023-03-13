import java.util.*;
class Transpose_Matrix
{
  public static void main(String args[])
  {
    int i,j;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter order of matrix");
    int m = sc.nextInt();
    int n = sc.nextInt();
    int a[][] = new int[m][n];
    System.out.println("Enter Matrix");
    for(i=0;i<m;i++)
    {
      for(j=0;j<n;j++)
      {
        a[i][j] = sc.nextInt();
      }
    }
    int T[][] = new int[10][10];
    for(i=0;i<m;i++)
    {
      for(j=0;j<n;j++)
      {
        T[i][j] = a[j][i];
      }
    }
    System.out.println("Transpose is :");
    for(i=0;i<m;i++)
    {
      for(j=0;j<n;j++)
      {
        System.out.print(T[i][j] + "\t");
      }
      System.out.print("\n");
    }
  }
}
