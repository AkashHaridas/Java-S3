import java.util.*;
class Sum_Fact{

    void sum(int n)
    {
        int sum=0,d;
        while (n!=0)
        {
            d = n%10;
            sum = sum + d;
            n = n/10;
        }
        System.out.println("The sum of numbers is " + sum);
    }

    void fact(int f)
    {
        int t=1;
        if(f==0)
          System.out.println("The factorial of 0 is 1");
        if(f==1)
          System.out.println("The factorial of 1 is 1");
        else
        {
            for(int i=2;i<=f;i++)
            t = t*i;
        }
        System.out.println("The factorial of " + f + " is " + t);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Sum_Fact obj = new Sum_Fact();
        System.out.println("Enter a number");
        int a = sc.nextInt();
        obj.sum(a);
        obj.fact(a);
    }
}