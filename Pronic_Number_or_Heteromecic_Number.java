import java.util.Scanner;
class Uglynum
{
    public static boolean ispronic(int n)
    {
        for(int i=0;i<=Math.sqrt(n);i++)
        {
            if(i*i+1==n)
            return true;
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(ispronic(n))
        {
            System.out.println("NO");
        }
        else
        System.out.println("YES");
    }
}