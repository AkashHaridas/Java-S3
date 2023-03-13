import java.util.*;
class Trace_Matrix
{
  public static void main(String args[])
  {
    int i,j,trace=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter order of square matrix");
    int m = sc.nextInt();
    int a[][]= new int[m][m];
    System.out.println("Enter Matrix");
    for(i=0;i<m;i++)
      for(j=0;j<m;j++)
        a[i][j] = sc.nextInt();
    for(i=0;i<m;i++)
      for(j=0;j<m;j++)
        if(i==j)
          trace = trace + a[i][j];
    System.out.println("Trace = " + trace);
  }
}
