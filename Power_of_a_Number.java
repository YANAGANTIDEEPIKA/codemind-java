import java.util.Scanner;
class Power
{
    public static void main(String args[])
{
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();int b=s.nextInt();int c=s.nextInt();
   int d=(int)Math.pow(a,b);
    System.out.println(d%c);
}
}