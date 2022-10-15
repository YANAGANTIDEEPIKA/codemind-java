import java.util.Scanner;
class Camel
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
        int i=0,c=1;
        for(i=0;i<st.length();i++)
        {
            if(st.charAt(i)>='a' && st.charAt(i)<='z')
            {
            break;
            }
        }
        for(int j=i;j<st.length();j++)
        {
             if(st.charAt(j)>='A' && st.charAt(j)<='Z')
            {
                c++;
            }
        }
        System.out.println(c);
    }
}