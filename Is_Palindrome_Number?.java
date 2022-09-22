import java.util.Scanner;
class Pallin
{
    public static int pallind(int n)
    {
        int r,re=0,sn;
        sn=n;
        while(sn!=0)
        {
            r=sn%10;
            re=re*10+r;
            sn=sn/10;
        }
        if(n==re)
        return 2;
        else 
        return 1;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(pallind(n)==2)
        System.out.println("2");
        if(pallind(n)==1)
        System.out.println("1");
    }
}