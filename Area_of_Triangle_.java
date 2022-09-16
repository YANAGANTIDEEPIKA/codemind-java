import java.util.Scanner;
class Area
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double a,b,c;
        a=sc.nextDouble(); b=sc.nextDouble(); c=sc.nextDouble();
        double su,ar;
        su=(a+b+c)/2;
        ar=Math.sqrt(su*(su-a)*(su-b)*(su-c));
        System.out.format("%.2f",ar);
        sc.close();
        
    }
}