import java.util.Scanner;
class Hand
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sh;
        sh=((n-1)*n)/2;
        System.out.println(sh);
        sc.close();
    }
}