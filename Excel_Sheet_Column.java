import java.util.Scanner;
class Excel
{
    public static void excelname(int n)
    {
        StringBuilder colname=new StringBuilder();
        while(n>0)
        {
            int re=n%26;
            if(re==0)
            {
               colname.append("Z");
               n=(n/26)-1;
               //System.out.println(n);
            }
            else
            {
                colname.append((char)((re-1)+'A'));
                n=n/26;
            }
        }
            System.out.println(colname.reverse());
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        excelname(n);
    }
}