import java.util.Scanner;
class Space
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
        int c=0;
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if(ch==' ')
            {
                c++;
            }
        }
        System.out.println(c+1);
    }
}