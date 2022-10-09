import java.util.Scanner;
class Candies
{
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
      int left = (int)Math.pow(2, (int)(Math.log(n) / Math.log(2)));
       int right=left*2;
      int re=Math.min(Math.abs(n-left),Math.abs(n-right));
      System.out.println(re);
    }
}