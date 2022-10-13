import java.util.Scanner;
class Space
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
        int v=0,c=0,d=0,w=0;
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
            {
           ch=Character.toLowerCase(ch);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            v++;
            else
            c++;
            }
          else if(ch>='0' && ch<='9')
          {
            d++;
          }
            else
            {
            w++;
            }
        }
        System.out.println("Vowels: "+v);
        System.out.println("Consonants: "+c);
        System.out.println("Digits: "+d);
        System.out.println("White spaces: "+w);
    }
}