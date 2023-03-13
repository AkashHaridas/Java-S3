import java.util.*;
class Palindrome_String
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.next();
        
        String t=s;
        int i,n;
        n=s.length();

        for(i=0;i<n;i++)
        {
            if(s.charAt(i)==t.charAt(n-i-1))
                continue;
            else {
                System.out.println("The string is not palindrome");
                break;
            }
            
        }
        if(i==n)
            System.out.println("The String is palindrome");
    }
}