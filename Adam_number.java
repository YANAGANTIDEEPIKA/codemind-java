 import java.util.Scanner;
 class Revsq
 {
     public static int rev(int n)
     {
         int re=0,r;
         while(n!=0)
         {
              r=n%10;
             re=re*10+r;
             n/=10;
         }
        return re;
     }
     public static void main(String args[])
     {
         Scanner s=new Scanner(System.in);
         int n=s.nextInt();
         int rn=rev(n);
        int s1,s2;
        s1=n*n;
        s2=rn*rn;
        if(s1==rev(s2))
        System.out.println("True");
        else
         System.out.println("False");
     }
 }