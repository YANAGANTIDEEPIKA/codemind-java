import java.util.Scanner;
class Table
{
    public static int ishappy(int n)
    {
       int sum=0,re=0,r;
       while(n!=0)
       {
           r=n%10;
           sum+=r*r;
           n/=10;
       }
       return sum;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        while(n>=9)
        {
            n=ishappy(n);
        }
        if(n==1 || n==7)
            System.out.println("True");
        else
            System.out.println("False");
        
    }
}