import java.util.Scanner;
class Winner
{
    public static void sort(int a[])
    {
        int temp;
        for(int i=1;i<a.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(Math.abs(a[j])>Math.abs(a[i]))
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i=0;i<a.length;i++)
          System.out.print(Math.abs(a[i]*a[i])+" ");
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        sort(a);
    }
}