public class Garbagecollection
{
    public void finalize()
    {
        System.out.println("Garbage collected....");
    }
    public static void main(String args [])
    {
        Garbagecollection o1 = new Garbagecollection();
        Garbagecollection  o2 = new Garbagecollection();
        o1=null;
        o2=null;
        System.gc();
    }
  }

//Example 2
class Student
{
    int a,b;
    public void inputdata(int c,int d)
    {
        a=c;
        b=d;
     }
    public void display()   
    {
         System.out.println("Value of a = "+a);
         System.out.println("Value of b = "+b);
     }
    public static void main(String args[])
    {
         Student s1 = new Student();
         Student s2 = new Student();
         s1.inputdata(1,2);
         s2.inputdata(3,4);
         s1.display();
         s2.display();
         Student s3;
         s3=s2;
         s3.display();
        s2=null;
        s3.display();
        s3=null;
        s3.display();
  }
}