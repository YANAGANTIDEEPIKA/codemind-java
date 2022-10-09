import java.util.Scanner;
class Candies
{
    public static int fact(int n)
    {
        int pr=1;
        for(int i=1;i<=n;i++)
        {
           pr=pr*i; 
        }
        return pr;
    }
    public static boolean strong(int n)
    {
        int sum=0,t;
        t=n;
        while(n!=0)
        {
           int r=n%10;
           sum=sum+fact(r);
           n=n/10;
        }
        if(t==sum)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        if(strong(n))
        System.out.println("The number "+n+" is a strong number");
        else
        System.out.println("The number "+n+" is not a strong number");
    }
}