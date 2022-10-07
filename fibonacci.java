import java.util.Scanner;
class Table
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=0,b=1,c=0;
        int n=s.nextInt();
        System.out.print(a+" "+b+" ");
        for(int i=0;i<n-2;i++)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }
    }
}