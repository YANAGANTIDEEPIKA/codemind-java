import java.util.Scanner;
class Occurance
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
        int sum=0;
        for(int i=0;i<st.length();i++)
        {
           if(st.charAt(i)>='0' && st.charAt(i)<='9')
           {
               int k=st.charAt(i)-'0';
               sum+=k;
           }
        }
      System.out.println(sum);
    }
}
