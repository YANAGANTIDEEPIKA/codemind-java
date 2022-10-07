import java.util.Scanner;
class Sum
{
    public static boolean isprime(int n)
    {
        if(n<2)
        return false;
        else
        {
            for(int i=2;i<Math.sqrt(n);i++)
            {
                if(n%i==0)
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        int t=s.nextInt();
        if(isprime(t))
        System.out.println("prime");
        else
        System.out.println("not a prime");
    }
}