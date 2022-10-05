import java.util.Scanner;
class Winner
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
        int xsum=0,ysum=0;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            xsum+=a[i];
            else
            ysum+=a[i];
        }
        if(Math.abs(xsum-ysum)%4==0)
        {
            System.out.println("X");
        }
        else
        System.out.println("Y");
    }
}