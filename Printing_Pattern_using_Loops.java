import java.util.Scanner;
class Pattern
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i,j;
    for(i=n;i>1;i--)
    {
        for( j=n;j>=1;j--)
        {
            if(j>i)
              System.out.print(j+" ");  
            else
                System.out.print(i+" ");
        }
        for(j=2;j<=n;j++)
        {
            if(j>i)
            System.out.print(j+" ");
            else
            System.out.print(i+" ");
        }
        System.out.println();
    }
    for(i=1;i<=n;i++)
    {
        for(j=n;j>=1;j--)
        {
            if(j>i)
            System.out.print(j+" ");
            else
            System.out.print(i+" ");
        }
       for(j=2;j<=n;j++)
        {
            if(j>i)
            System.out.print(j+" ");
            else
            System.out.print(i+" ");
        }
        System.out.println(); 
    }
    }
}