import java.util.Scanner;
class Reverse
{
    public static int reverse(int n)
    {
        int re=0,r;
        while(n!=0)
        {
            r=n%10;
            re=re*10+r;
            n=n/10;
        }
     return re;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n>0)
        {
        System.out.println(reverse(n));
        }
        else
        {
            n=n*-1;
            System.out.println("-"+reverse(n));
        }
    }
}