import java.util.Scanner;
class Cloth
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[1001];
        for(int i=0;i<n;i++)
        {
            int x;
            x=s.nextInt();
            a[x]++;
        }
        int c=0;
        for(int i=0;i<=1000;i++)
        {
           c+=a[i]/2;
        }
        System.out.println(c);
    }
}