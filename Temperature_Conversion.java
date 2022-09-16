import java.util.Scanner;
class Area
{
    public static void main(String args[])
    {
        double r;
        Scanner sc=new Scanner(System.in);
        r=sc.nextDouble();
         Double a=(32)+(r*9/5);
        System.out.printf("%.2f",a);
        sc.close();
    }
}