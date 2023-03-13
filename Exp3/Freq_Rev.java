import java.util.*;
class Freq_Rev
{
    void freq(String a)
    {
        Scanner sc1 = new Scanner(System.in);
        int c = 0;
        System.out.println("Enter the character whose frequency is to be found: ");
        String f = sc1.nextLine();
        for(int i=0; i<a.length(); i++)
          if (a.charAt(i) == f.charAt(0))
            c++;
        System.out.println("The frequency of the character " + f + " is " + c);
    }

    void rev(String r)
    {
        String s="";
        int l=r.length();
        for (int i=0; i<l; i++)
          s += r.charAt(l-i-1);
        System.out.println("Reverse is " + s);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.next();
        Freq_Rev obj = new Freq_Rev();
        obj.freq(s);
        obj.rev(s);
    }
}