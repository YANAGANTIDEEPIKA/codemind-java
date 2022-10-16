import java.util.Scanner;
class Rev
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        s.nextLine();
        for(int i=0;i<t;i++)
        {
        String st=s.nextLine();
        int c=0;
        for(int j=0;j<st.length();j++)
        {
            if(st.charAt(j)>=48 && st.charAt(j)<=57)
            {
                c=1;
             System.out.println("Yes");
             break;
            }
        }
        if(c==0)
        System.out.println("No");
        }
    }
}