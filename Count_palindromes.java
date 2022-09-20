import java.util.Scanner;
class Pallin
{
    public static boolean pallin(int n)
    {
        int re=0,r,sn;
        sn=n;
        while(sn!=0)
        {
            r=sn%10;
            re=re*10+r;
            sn=sn/10;
        }
        if(n==re)
        return true;
        else 
        return false;
    }
    public static void main(String args[])
    {
        int a[],n,i;
        Scanner s=new Scanner (System.in);
         n=s.nextInt();
         a=new int[n];
         int c=0;
        for(i=0;i<n;i++)
        {
            a[i]=s.nextInt();
            if(pallin(a[i]))
              c++;
        }
        System.out.println(c);
    }
}