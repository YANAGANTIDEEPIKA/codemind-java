import java.util.Scanner;
class Pallin
{
    public static void main(String args[])
    {
        int a[],n,k,i;
        Scanner sc=new Scanner (System.in);
         n=sc.nextInt();
         a=new int[n];
         int c=0;
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=1;i<n;i++)
        {
            if(a[i]>a[i-1])
            c++;
        }
        if(c==0)
        System.out.println("yes");
        else
        System.out.println("no");
    }
}