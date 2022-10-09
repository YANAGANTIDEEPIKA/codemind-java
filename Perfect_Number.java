import java.util.Scanner;
class Candies
{
    public static boolean neon(int n)
    {
        int sum=0;
       for(int i=1;i<n;i++)
       {
           if(n%i==0)
           sum+=i;
       }
        if(n==sum)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        if(neon(n))
        System.out.println("True");
        else
        System.out.println("False");
    }
}