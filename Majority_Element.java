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
            int maxco=0;
            int k=0;
         for(int i=0;i<n;i++)
         {
             int c=0;
           for(int j=0;j<n;j++)
           {
               if(a[i]==a[j])
               {
                   c++;
               }
           }
           if(maxco<c)
           {
               maxco=c;
              k=a[i];
           }
         }
         System.out.println(k);
    }
}