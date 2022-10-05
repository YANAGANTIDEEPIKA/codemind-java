import java.util.Scanner;
class Unique
{
    public static void unique(int a[],int n)
    {
        for(int i=0;i<n;i++)
        {
            int c=0;
            for(int j=0;j<n;j++)
            {
                
                if(a[i]>a[j])
                {
                    c++;
                }
            }
         System.out.print(c+" ");
        }
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=s.nextInt();
        unique(a,n);
    }
}