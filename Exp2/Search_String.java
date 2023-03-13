import java.util.*;
class Search_String
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.next();
        int n = s.length();
        System.out.println("Enter the character to search");
        String a = sc.next();
        int c = 0;

        for(int i = 0; i < n; i++)
          if(s.charAt(i) == a.charAt(0))
          {
            System.out.println("Character found at " + (i+1) + " position");
            c = 1;
            break;
          }
            else
              continue;
          if (c==0)
            System.out.println("Character not found");
    }
}