import java.util.Scanner;
class Table
{
    public static boolean isdisarium(int n)
    {
        int t=n;
        int sum=0;
        int c=(int)Math.log10(n)+1;
        while(n!=0)
        {
           int r=n%10;
            sum+=(int)Math.pow(r,c);
            n=n/10;
            c--;
        }
        if(sum==t)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(isdisarium(n))
        System.out.println("True");
        else
        System.out.println("False");
    }
}