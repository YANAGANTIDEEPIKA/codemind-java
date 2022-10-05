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
         for(int k=0;k<n;k=k+2)
         {
            int l=a[k];
            int temp[]=new int[l];
            for(int j=0;j<l;j++)
            {
                temp[j]=a[k+1];
                 System.out.print(temp[j]+" ");
            }
         }
    }
}