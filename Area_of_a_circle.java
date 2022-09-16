import java.util.Scanner;
class Area
{
    public static void main(String args[])
    {
        double r;
        Scanner sc=new Scanner(System.in);
        r=sc.nextDouble();
         Double a=(3.14)*r*r;
        System.out.printf("%.2f",a);
        sc.close();
    }
}