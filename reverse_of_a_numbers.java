import java.util.Scanner;
class Table
{
    public static int revnum(int n)
    {
        int re=0,r;
        while(n!=0)
        {
            r=n%10;
            re=re*10+r;
            n/=10;
        }
        return re;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(revnum(n));
    }
}