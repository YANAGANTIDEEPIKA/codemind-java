import java.util.Scanner;
class Occurance
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
        int mc=0,c=0,q=0;
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
         if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
         {
             c++;
             q=c;
         }
         else
         {
             c=0;
         }
          if(mc<q)
             {
                 mc=q;
             }
        }
      System.out.println(mc);
    }
}