import java.util.Scanner;
class Absolute
{
    public static int absolute(String n,int x,int t2)
    {
    String t=n.substring(0,x);
    int t1=Integer.valueOf(t);
    int q=t1-t2;
     return Math.abs(q);
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();int x=s.nextInt();
       int p=(int)Math.pow(10,x);
       int t2=n%p;
        System.out.println(absolute(Integer.toString(n),x,t2));
    }
}