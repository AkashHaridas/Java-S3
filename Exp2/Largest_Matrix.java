import java.util.*;
class Largest_Matrix
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows : ");
    int r = sc.nextInt();
    System.out.println("Enter the number of columns : ");
    int c = sc.nextInt();
    int a[][] = new int[20][20];
    int max,i,j;
    System.out.println("Enter matrix \n");
    for(i=0;i<r;i++)
      for(j=0;j<c;j++)
        a[i][j] = sc.nextInt();
    max = a[0][0];
    for(i=0;i<r;i++)
      for(j=0;j<c;j++)
        if (a[i][j] > max)
          max = a[i][j];
    System.out.println("Largest element = " + max);
  }
}
