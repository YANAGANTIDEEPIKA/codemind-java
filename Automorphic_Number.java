import java.util.Scanner;
class Unique
{
    public static void factor(int n)
    {
        int t=n;
        int l=(int)Math.log10(n)+1;
        int i=(int)Math.pow(10,l);
        if(t==(n*n)%i)
        System.out.println("Automorphic Number");
        else
        System.out.println("Not an Automorphic Number");
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
       factor(n);
    }
}