import java.util.Scanner;
class Sorting
{
    public static void main(String args[])
    {      
        int c=0;
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++)
        {
            int x=s.nextInt();
            int[] a=new int[x];
            for(int j=0;j<x;j++)
            {
                a[j]=s.nextInt();
               // System.out.println(a[j]);
            }
            for(int k=1;k<x;k++)
            {
                if(a[k-1]>a[k])
                {
                    c++;
                }
            }
            if(c==0)
            {
                System.out.println(c);
            }
            else
            {
                int min=a[0];
                int max= a[0];
                for(int h=0;h<x;h++)
                {
                    if(min>a[h])
                    {
                        min=a[h];
                    }
                    if(max<a[h])
                    {
                        max=a[h];
                    }
                }
                System.out.println(max-min);
            }
        }
    }
}