import java.util.Scanner;
class Sum
{
   public static void main(String args[])
   {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int alpha=65;
        int k=0;
       for(int i=1;i<=n;i++)
       {
           for(int j=1;j<=n;j++)
           {
               System.out.print((char)(alpha+k)+" ");
           }
           k++;
           System.out.println();
       }
   }
}