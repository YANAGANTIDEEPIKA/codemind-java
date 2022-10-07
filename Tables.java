import java.util.Scanner;
class Table
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();int t=s.nextInt();
        for(int i=1;i<=t;i++)
        {
            if(i%2!=0)
            System.out.println(n+" x "+i+" = "+n*i);
        }
    }
}