import java.util.Scanner;
class Circular
{
    public static boolean palin(int n)
    {
        int re=0,r,t;
        t=n;
        if(n<0)
        return false;
        else
        {
           while(t!=0)
           {
               r=t%10;
               re=re*10+r;
               t/=10;
           }
        }
        if(re==n)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++)
        {
           int n=s.nextInt();
            if(palin(n))
            System.out.println("True");
            else
            System.out.println("False");
        }
    }
}