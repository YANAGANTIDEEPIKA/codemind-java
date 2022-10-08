import java.util.Scanner;
class Unique
{
    public static int factor(int p)
    {
        int sum=0;
       for(int i=1;i<p;i++)
       {
           if(p%i==0)
           {
               sum+=i;
           }
       }
       return sum;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
       int n1=factor(n);
       int m1=factor(m);
        if(n1==m && m1==n)
        System.out.println("Amicable");
        else
        System.out.println("Not Amicable");
    }
}