import java.util.Scanner;
class Sum
{
   public static void main(String args[])
   {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       float sum=0;
       for(int i=1;i<=n;i++)
       {
           sum+=(float)1/i;
       }
       System.out.format("%.2f",sum);
   }
}