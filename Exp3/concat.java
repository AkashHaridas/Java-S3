import java.util.*;
class concat
{
    void con(int x,int y)
    {
        System.out.println("Concatenated Integers: "+x+y);
    }

    void con(String x, String y)
    {
        System.out.println("Concatenated Strings: "+x+" "+y);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        concat fun = new concat();
        
        System.out.print("Enter the first no : ");
        int a = sc.nextInt();
        System.out.print("Enter the second no : ");
        int b = sc.nextInt();
        fun.con(a,b);
            
        System.out.print("Enter the first string : ");
        String str1 = sc.next();
        System.out.print("Enter the second string : ");
        String str2 = sc.next();
        fun.con(str1,str2);
            
    }
}