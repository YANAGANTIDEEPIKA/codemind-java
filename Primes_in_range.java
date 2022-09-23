import java.util.Scanner;
class Prime
{
    public static boolean isprime(int n)
    {
        if(n==1 || n==0)
        return false;
        else
        {
            for(int i=2;i<=Math.sqrt(n);i++)
            {
                if(n%i==0)
                return false;
            }
            return true;
        }
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        int c=0;
        for(int i=m;i<=n;i++)
        {
            if(isprime(i))
            {
                c++;
            }
        }
        System.out.println(c);
    }
}