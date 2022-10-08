import java.util.Scanner;
class Circular
{
    public static boolean prime(int n)
    {
        if(n<2 )
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
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int re=0,r,t;
        t=n;
        while(t!=0)
        {
            r=t%10;
            re=re*10+r;
            t/=10;
        }
        if(prime(re) && prime(n))
        System.out.println("circular prime");
        else if(prime(n) || prime(re))
        System.out.println("prime but not a circular prime");
        else
        System.out.println("not prime");
    }
}