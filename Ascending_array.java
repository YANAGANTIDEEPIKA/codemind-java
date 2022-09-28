import java.util.Scanner;
class Ascending
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int c=0;
        for(int i=1;i<a.length;i++)
        {
            if(a[i-1]>=a[i] )
            {
                c=1;
        System.out.println("no");
                break;
            }
        }
        if(c==0)
        System.out.println("yes");
    }
}