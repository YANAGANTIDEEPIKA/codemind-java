import java.util.Scanner;
class Pallin
{
    public static void main(String args[])
    {
        int a[],n,k,i;
        Scanner sc=new Scanner (System.in);
         n=sc.nextInt(); k=sc.nextInt();
         a=new int[n];
         int c=0;
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]%k==0)
              c++;
        }
        System.out.println(c);
    }
}