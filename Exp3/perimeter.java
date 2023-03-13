import java.util.*;

class calc
{
    calc(float r)
    {
        float p=(2*22*r)/7;
        System.out.println("Perimeter: "+p);
    }
    calc(float l,float b)
    {
        float p=2*(l+b);
        System.out.println("Perimeter:"+p);
    }
    calc(double w)
    {}
}

class perimeter
{
    public static void main(String args[])
    {
        Scanner read=new Scanner(System.in);
        System.out.println("-----MENU-----");
        System.out.println("1.Circle\n2.Rectangle\nChoose the shape whose perimeter needs to be found: ");
        int sh=read.nextInt();
        calc find=new calc(4.93);
        switch(sh)
        {
            case 1:
                System.out.println("Enter the radius : ");
                float r=read.nextFloat();
                find=new calc(r);
                break;
            case 2:
                System.out.println("Enter the length : ");
                float l=read.nextFloat();
                System.out.println("Enter the breadth : ");
                float b=read.nextFloat();
                find=new calc(l,b);
                break;
            default :
                System.out.println("Invalid Entry!");
        }
    }
}