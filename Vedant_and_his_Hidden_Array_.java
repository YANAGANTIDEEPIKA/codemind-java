import java.util.Scanner;
class Vedant
{
    public static void main(String aegs[])
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++)
        {
            int a=s.nextInt();int b=s.nextInt();
            if(a==1)
            {
                if(b%2==0)
                {
                    System.out.println("Even");
                }
                else
                {
                    System.out.println("Odd");
                }
            }
            else if(b%2==0)
            {
                 System.out.println("Impossible");
            }
            else if(a%2==0)
            {
                 System.out.println("Even");
            }
            else
            {
                 System.out.println("Odd");
            }
        }
    }
}