import java.util.Scanner;
class Winner
{
    public static int count(int tt,int a[],int b[])
    {
        int c=0;
        for(int i=0;i<a.length;i++)
        {
          if(a[i]>=tt || b[i]>=tt && i<a[i] && i<b[i])
          {
              c++;
          }
        }
        return c;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        int m=s.nextInt();
        int b[]=new int[m];
        for(int i=0;i<m;i++)
            b[i]=s.nextInt(); 
        int tt=s.nextInt();
        if(n>=1)
        System.out.println(count(tt,a,b));
    }
}