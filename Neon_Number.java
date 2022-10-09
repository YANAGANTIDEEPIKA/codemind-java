import java.util.Scanner;
class Candies
{
    public static boolean neon(int n)
    {
        int sum=0,t,pr=1;
        t=n*n;
        while(t!=0)
        {
           int r=t%10;
           sum=sum+r;
           t/=10;
        }
        if(n==sum)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        if(neon(n))
        System.out.println("Neon Number");
        else
        System.out.println("Not Neon Number");
    }
}