import java.util.Scanner;
class Rev
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
        String str[]=st.split(" ");
       // System.out.println(str[1]);
       for(int j=0;j<str.length;j++)
       {
        char ch[]=str[j].toCharArray();
       for(int i=ch.length-1;i>=0;i--)
        {
           System.out.print(ch[i]);
        }
        System.out.print(" ");
       }
    }
}