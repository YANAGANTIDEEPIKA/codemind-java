import java.util.Scanner;
class Area
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double a,b;
        a=sc.nextDouble();  b=sc.nextDouble();
        double ar;
        ar=(a+b)/2;
        System.out.format("%.4f",ar);
        sc.close();
        
    }
}