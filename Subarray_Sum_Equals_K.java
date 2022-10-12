import java.util.Scanner;
class Vedant
{
    public static void main(String aegs[])
    {
        Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();int b=sc.nextInt();
     int x[]=new int[a];
       int c=0,j=0;
       for(int i=0;i<a;i++)
       {
           x[i]=sc.nextInt();
       }
       for(int i=0;i<a;i++)
       {
            int s=0;
           for(j=i;j<a;j++)
           {
               s=s+x[j];
               if(s==b)
               {
               c++;
               }
               if(c>b)
               {
               break;
               }
           }
       }
       System.out.println(c);
    }
}