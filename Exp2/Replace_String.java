import java.util.*;
class Replace_String
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.next();
        System.out.println("Enter the character to be replace");
        String c = sc.next();
        System.out.println("Enter the new character");
        String d = sc.next();
        String s1 = s.replaceAll(c,d);
        System.out.println("The new string is " + s1);
    }
}