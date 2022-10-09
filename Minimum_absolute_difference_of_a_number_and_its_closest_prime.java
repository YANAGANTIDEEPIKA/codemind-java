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
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int least=0,high=0,t1,t2;
        t1=n;
        t2=n;
        while(true)
        {
            if(prime(t1))
            {
            least=t1;
            break;
            }
            else
            {
               t1=t1-1;
            }
        }
        
        while(true)
        {
            if(prime(t2))
            {
            high=t2;
            break;
            }
            else
            {
               t2=t2+1;
            }
        }
        int re=Math.min((n-t1),(t2-n));
        System.out.println(re);
    }
}