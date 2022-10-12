import java.util.Scanner;
class Vedant
{
    public static void main(String aegs[])
    {
        Scanner s=new Scanner(System.in);
        int l=s.nextInt();
        int r=s.nextInt();
        int c=0,x;
        for(int i=l;i<=r;i++)
        {
            x=0;
            for(int j=i;j<=r;j++)
            {
                x+=j;
                if(x%2!=0)
                {
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}