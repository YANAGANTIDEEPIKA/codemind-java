import java.util.Scanner;
class Unique
{
    public static void unique(int a[],int n)
    {
        int uni[]=new int[n];
        int max=0;
        for(int i=0;i<n;i++)
        {
            int c=0;
            for(int j=0;j<n;j++)
            {
                if(a[i]==a[j])
                {
                c++;
                }
            }
            if(c==1)
          uni[i]=a[i];
         // System.out.print(uni[i]+"  ");
        }
        for(int i=0;i<n;i++)
    {
        if(uni[i]>max)
        {
            max=uni[i];
        }
    }
    if(max>0)
    System.out.println(max);
    else
    System.out.println("-1");
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