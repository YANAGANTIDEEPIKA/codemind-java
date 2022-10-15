import java.util.Scanner;
class Occurance
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
       char max='a';
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
           if(max<ch)
           max=ch;
        }
      System.out.println(max);
    }
}
