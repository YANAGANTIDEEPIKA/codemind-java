import java.util.*;
class solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        while(n-->0)
        {
            int a=s.nextInt();
            int b=s.nextInt();
            String st=s.next();
            char[] cha = new char[st.length()];
            for(int i=0;i<st.length();i++)
                cha[i]=st.charAt(i);
            while(b>0)
            {
                int k=b-1;
                int j=0;
                while(j<k)
                {
                    char temp=cha[j];
                    char te=cha[k];
                    cha[j]=te;
                    cha[k]=temp;
                    j++;
                    k--;
                }
                b--;
            }
            st=String.valueOf(cha);
            System.out.print(st);
            System.out.println();
        }
    }
}