import java.util.Scanner;
class Pattern
{
    public static void main(String[] args) 
    {
		        Scanner s=new Scanner(System.in);
		        int n=s.nextInt();
		        int p=n;
		        for(int i=0;i<n;i++)
		        {
		        for(int j=0;j<n;j++)
		        {
		          if(i==j || i+j==n-1)
		          {
		              System.out.print(p+" ");
		          }
		          else
		          System.out.print(" ");
		        }
		        p--;
		        System.out.println();
		        }
    }
}