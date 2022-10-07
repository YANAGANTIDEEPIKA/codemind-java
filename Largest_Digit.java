import java.util.Scanner;
class Table
{
    public static int revnum(int n)
    {
        int max=0,r;
        while(n!=0)
        {
            r=n%10;
            if(max<r)
            max=r;
            n/=10;
        }
        return max;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(revnum(n));
    }
}