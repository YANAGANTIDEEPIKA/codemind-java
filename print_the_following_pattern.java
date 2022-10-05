import java.util.Scanner;
class Pattern
{
    public static void main(String[] args) 
    {
		        Scanner s=new Scanner(System.in);
		        int n=s.nextInt();
		        for(int i=0;i<n;i++)
		        {
		        for(int j=0;j<n;j++)
		        {
		            if(j==i || i+j==n-1)
		            System.out.print("x"+"");
		            else
		            System.out.print("0"+"");
		        }
		        System.out.println();
		        }
    }
}