import java.util.Scanner;
class Unique
{
    public static boolean isunique(String p)
    {
       int l=p.length();
       for(int i=0;i<l-1;i++)
       {
           for(int j=i+1;j<l;j++)
           {
               if(p.charAt(i)==p.charAt(j))
               return false;
           }
       }
       return true;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(isunique(Integer.toString(n)))
        System.out.println("Unique Number");
        else
        System.out.println("Not Unique Number");
        
    }
}