import java.util.Scanner;
class Candies
{
    public static boolean prime(int n)
    {
        if(n<2)
        return false;
        else
        {
            for(int i=2;i<=(int)Math.sqrt(n);i++)
            {
                if(n%i==0)
                return false;
            }
        }
        return true;
    }
    public static boolean megaprime(int n)
    {
        while(n!=0)
        {
            int r=n%10;
            n=n/10;
            if(prime(r))
            continue;
            else
            return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
       if(prime(n) && megaprime(n))
       System.out.println("Mega Prime");
       else
       System.out.println("Not Mega Prime");
    }
}