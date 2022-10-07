import java.util.Scanner;
class Table
{
   public static boolean isprime(int n)
   {
       if(n==1)
       return false;
       for(int i=2;i<=(int)Math.sqrt(n);i++)
       {
           if(n%i==0)
           return false;
       }
       return true;
   }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int f=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
              if(isprime(i))
              {
                  System.out.print(i+" ");
                  f++;
              }
            }
        }
        if(f==0)
        System.out.println("-1");
    }
}