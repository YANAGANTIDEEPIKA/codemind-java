import java.util.Scanner;
class Table
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();int t=s.nextInt();
        if(n%2==0 || t%2==0)
        System.out.println("Player 1");
        else
        System.out.println("Player 2");
    }
}