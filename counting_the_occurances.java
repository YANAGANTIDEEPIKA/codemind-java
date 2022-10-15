import java.util.Scanner;
class Occurance
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
        char ch=s.nextLine().charAt(0);
        int c=0;
        for(int i=0;i<st.length();i++)
        {
           if(ch==st.charAt(i))
           {
               c++;
           }
        }
        if(c==0)
        System.out.println("-1");
        else
        System.out.println(c);
    }
}
