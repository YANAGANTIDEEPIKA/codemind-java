import java.util.Scanner;
class Sum
{
   public static void main(String args[])
   {
       Scanner s=new Scanner(System.in);
       int t=s.nextInt();
       for(int i=0;i<t;i++)
       {
       int x=s.nextInt();int y=s.nextInt();
       int c=0;
       for(int j=x;j<=y;j++)
       {
           if(j%10==2 || j%10==3 || j%10==9)
           {
               c++;
           }
       }
       System.out.println(c);
       }
   }
}