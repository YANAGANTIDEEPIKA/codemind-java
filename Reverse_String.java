import java.util.Scanner;
class Rev
{
    public static void rev(String st)
    {
       for(int i=st.length()-1;i>=0;i--)
       {
           char ch=st.charAt(i);
           System.out.print(ch);
       }
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
      rev(st);
    }
}