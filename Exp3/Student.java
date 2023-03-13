import java.util.*;
class Student 
{
    String name;
    int roll;
    int marks[] = new int[5];

     void getdata()
     {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the roll_no");
         roll = sc.nextInt();
         System.out.println("Enter the name");
         name = sc.next();
         System.out.println("Enter the marks of 5 subjects");
         for (int i = 0; i < 5; i++)
         {
            System.out.println("Subject " + (i+1) + " "); 
            marks[i] = sc.nextInt();
         }
     }

     void putdata()
     {
         System.out.println("Roll no : " + roll);
         System.out.println("Name : " + name);
         for (int i = 0; i < 5; i++)
           System.out.println("Marks obtained in Subject " + (i+1) + " = " + marks[i]);
     }

    public static void main(String args[])
    {
        System.out.println("Enter the details");
        Student obj = new Student();
        obj.getdata();
        System.out.println("****Student Details****");
        obj.putdata();
    }
}