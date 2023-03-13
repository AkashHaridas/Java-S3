import java.util.*;
class Area
{
  void area(float r)
  {
    float a = (22*r*r)/7;
    System.out.println("Area of the circle: "+a);
  }
  void area(float l,float b)
  {
    float a = l*b;
    System.out.println("Area of the rectangle: "+a);
  }
  void area(int l,int b)
  {
    int a = (l*b)/2;
    System.out.println("Area of the triangle: "+a);
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("-----MENU-----");
    System.out.println("1.Circle\n2.Rectangle\n3.Triangle");
    System.out.println("Choose a shape from the above menu whose area needs to be found.");
    int sh = sc.nextInt();
    Area shape = new Area();
    switch(sh)
    {
    case 1:
      System.out.println("Enter the radius : ");
      float r = sc.nextFloat();
      shape.area(r);
      break;
    case 2:
      System.out.println("Enter the length : ");
      float l = sc.nextFloat();
      System.out.println("Enter the breadth : ");
      float b = sc.nextFloat();
      shape.area(l,b);
      break;
    case 3:
      System.out.println("Enter the height: ");
      int len = sc.nextInt();
      System.out.println("Enter the base: ");
      int base = sc.nextInt();
      shape.area(len,base);
      break;
    default:
      System.out.println("Invalid Entry!");
    }
  }
}