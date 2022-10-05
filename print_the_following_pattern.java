import java.util.Scanner;
class Pattern
{
    public static void main(String[] args) 
    {
		        Scanner s=new Scanner(System.in);
		        int n=s.nextInt();
		        int p=n;
		        for(int i=n;i>=1;i--)
		        {
		        for(int j=1;j<i;j++)
		        {
		          System.out.print(" ");
		        }
		        for(int k=1;k<=n;k++)
		        {
		            if(k==1 || k==n || i==1 ||i==n)
		            {
		                System.out.print("*");
		            }
		            else
		            {
		                System.out.print(" ");
		            }
		        }
		        System.out.println();
		        }
    }
}