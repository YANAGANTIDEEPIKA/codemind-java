import java.util.Scanner;
class Candies
{
    public static boolean spy(int n)
    {
        int sum=0,t,pr=1;
        while(n!=0)
        {
           int r=n%10;
           sum=sum+r;
           pr=pr*r;
           n=n/10;
        }
        if(pr==sum)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        if(spy(n))
        System.out.println("Spy Number");
        else
        System.out.println("Not Spy Number");
    }
}