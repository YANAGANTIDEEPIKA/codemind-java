import java.util.Scanner;
class Sum
{
   public static void main(String args[])
   {
       Scanner s=new Scanner(System.in);
       int a=0,b=1,c;
       int n=s.nextInt();
       System.out.print(a+" "+b+" ");
       if(n==0)
       System.out.print(a);
       for(int i=1;i<n-1;i++)
       {
         c=a+b;
          a=b;
          b=c;
         System.out.print(c+" ");
       }
   }
}