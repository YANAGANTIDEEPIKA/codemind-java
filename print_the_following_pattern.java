import java.util.Scanner;
class Pattern
{
    public static void main(String[] args) 
    {
		        Scanner s=new Scanner(System.in);
		        int n=s.nextInt();
		        int p=1;
		        for(int i=1;i<=n;i++)
		        {
		        for(int j=1;j<n-1;j++)
		        {
		            System.out.print(j+"");
		        }
		        for(int k=1;k<n-2;k++)
		        {
		            System.out.print(k+"");
		        }
		        System.out.println();
		        }
    }
}