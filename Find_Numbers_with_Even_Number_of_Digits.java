import java.util.Scanner;
class Winner
{
    public static int count(int n)
    {
        int c=0;
        while(n!=0)
        {
            c++;
            n/=10;
        }
        return c;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
            int p=0;
        for(int i=0;i<n;i++)
        {
            if(count(a[i])%2==0)
            p++;
        }
        System.out.println(p);
    }
}