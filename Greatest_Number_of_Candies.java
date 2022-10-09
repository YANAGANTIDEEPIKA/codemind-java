import java.util.Scanner;
class Candies
{
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        int max=0;
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
            if(a[i]>max)
            max=a[i];
        }
        int t=s.nextInt();
        for(int i=0;i<n;i++)
    {
        if(max<=a[i]+t)
        System.out.print("True"+" ");
        else
        System.out.print("False"+" ");
    }
    }
}