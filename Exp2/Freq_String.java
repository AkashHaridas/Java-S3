import java.util.*;

import javax.lang.model.util.ElementScanner14;
class Freq_String
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.next();
        int n = s.length();

        System.out.println("Enter the character whose frequency is to be found");
        String a = sc.next();
        int c = 0;

        for (int i=0; i<n; i++)
          if(s.charAt(i) == a.charAt(0))
          {
              c++;
          }
          else
            continue;
          System.out.println("The frequency of the character " + a + " is " + c);
    }
}