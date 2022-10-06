import java.util.Scanner;
import java.io.*;
class Pallin
{
    public static boolean pallin(int n)
    {
        int te=n;
        int r,re=0;
       while(te!=0)
       {
        r=te%10;
        re=re*10+r;
        te/=10;
       }
       if(re==n)
       return true;
       else
       return false;
    }
    public static void main(String args[])
		    {
		        Scanner s=new Scanner(System.in);
		        int n=s.nextInt();
		       if(pallin(n))
		       System.out.println("True");
		       else
		       System.out.println("False");
		    }
}
