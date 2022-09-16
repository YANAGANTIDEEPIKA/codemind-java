import java.util.Scanner;
class Ascii
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
         float b=sc.nextFloat();
        float val;
        System.out.format("%.2f",a*b);
        sc.close();
    }
}