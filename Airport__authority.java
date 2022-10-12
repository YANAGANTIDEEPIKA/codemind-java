import java.util.Scanner;
class Vedant
{
    public static void main(String aegs[])
    {
        Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          int a[]=new int[n];
          int b=0;
          for(int i=0;i<n;i++)
          {
              a[i]=sc.nextInt();
          }
           int t=sc.nextInt();
           for(int i=0;i<n;i++)
          {
            if(a[i]<=t)
            {
                b+=1;
            }
            else
            {
                b+=2;
            }
          }
          System.out.println(b);
    }
}