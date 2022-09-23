import java.util.Scanner;
class Pattern
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n,i,j;
        n=s.nextInt();
        if(n>=3 && n<=100)
        {
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		if(i>n)
		{
			for(int k=n-1;k>=1;k--)
			{
				for(int g=1;g<=k;g++)
				{
					System.out.print("*");
				}
				System.out.println();
				n--;
			}
	    }
        }
        else
        System.out.println("The pattern is not possible");
    }
}