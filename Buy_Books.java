import java.util.Scanner;
class Vedant
{
    public static void main(String aegs[])
    {
        Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          int a[]=new int[n];
          int b[]=new int[n];
          for(int i=0;i<n;i++)
          {
              a[i]=sc.nextInt();
          }
           for(int i=0;i<n;i++)
           {
                b[i]=sc.nextInt();
           }
           int s1=0,s2=0;
           for(int i=0;i<n;i++)
          {
              s1+=a[i];
              s2+=b[i];
          }
          if(s2-s1<0)
          System.out.println("0");
          else
           System.out.println(s2-s1);
    }
}