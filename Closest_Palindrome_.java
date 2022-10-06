import java.util.Scanner;
import java.io.*;
class Pallin
{
    public static boolean pallin(String n)
    {
        int le=0;
       int ri=n.length()-1;
        while(le<ri)
        {
            if(n.charAt(le)!=n.charAt(ri))
            {
            return false;
            }
            le++;
            ri--;
        }
        return true;
    }
    public static void main(String args[])
		    {
		        Scanner s=new Scanner(System.in);
		        int n=s.nextInt();
		       int sp=n-1;
		       while(pallin(Integer.toString(sp))== false)
		       {
		           sp--;
		       }
		        int lp=n+1;
		        while(pallin(Integer.toString(lp))== false)
		        {
		            lp++;
		        }
		        if(Math.abs(n-sp)<Math.abs(n-lp) || Math.abs(n-sp)==Math.abs(n-lp))
		        {
		            System.out.print(sp+" ");
		        }
		        if(Math.abs(n-sp)>Math.abs(n-lp) || Math.abs(n-sp)==Math.abs(n-lp))
		        System.out.print(lp+" ");
		    }
}
