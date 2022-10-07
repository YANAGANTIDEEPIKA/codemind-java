import java.util.Scanner;
class Table
{
    public static boolean isfib(int n)
    {
        if(n==0 || n==1)
        return true;
        else
        {
            int a=0;
            int b=1;
            int c=a+b;
            while(c<n)
            {
                a=b;
                b=c;
                c=a+b;
            }
            if(c==n)
            return true;
            else
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(isfib(n))
        System.out.println("True");
        else
        System.out.println("False");
    }
}