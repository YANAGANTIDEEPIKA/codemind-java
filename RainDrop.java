import java.util.Scanner;
class Pandemic
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int c=0;
        if(n%3==0)
        {
        System.out.print("Pling");
        c++;
        }
        if(n%5==0)
        {
          System.out.print("Plang");
          c++;
        }
        if(n%7==0)
        {
          System.out.print("Plong");
          c++;
        }
        if(n%3!=0 && n%5!=0 && n%7!=0)
        {
        System.out.println(n);
        }
    }
}
