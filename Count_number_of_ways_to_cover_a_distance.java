import java.util.Scanner;
import java.io.*;
class Steps
{
    public static int printcount(int n)
    {
        if(n==0)
        return 1;
        if(n<0)
        return 0;
        return printcount(n - 1)+
               printcount(n - 2)+
               printcount(n - 3); 
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int c=0;
        System.out.println(printcount(n));
    }
}