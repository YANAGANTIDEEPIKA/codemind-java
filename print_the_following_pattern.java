import java.util.Scanner;
class Pattern
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i;
        for( i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==j || j==1 || i==n )
                {
                    System.out.print("*"+"");
                }
                else
                System.out.print(" "+"");
            }
            System.out.println();
        }
    }
}