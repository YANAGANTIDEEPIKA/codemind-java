import java.util.Scanner;
class Sum
{
    public static boolean isper(int n)
    {
        for(int i=1;i<n/2;i++)
        {
            if(i*i==n)
            return true;
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        int t=s.nextInt();
        if(isper(t))
        System.out.println("True");
        else
        System.out.println("False");
    }
}