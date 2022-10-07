import java.util.Scanner;
 class Revsq
 {
     public static void main(String args[])
     {
         Scanner s=new Scanner(System.in);
         int n=s.nextInt();int m=s.nextInt();
         int gcd=0;
         for(int i=1;i<=n && i<=m;i++)
         {
                 if(n%i==0 && m%i==0)
                 {
                     gcd=i;
                 }
         }
         System.out.println(gcd);
     }
 }