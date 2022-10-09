import java.util.Scanner;
class Ugly
{
    public static int divide(int n,int m)
    {
       while(n%m==0)
       {
           n=n/m;
       }
       return n;
    }
    public static int isugly(int n)
    {
        n=divide(n,2);
         n=divide(n,3);
          n=divide(n,5);
          return (n==1)?1:0;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(isugly(n)==1)
        System.out.println("Ugly Number");
        else
        System.out.println("Not Ugly Number");
    }
}