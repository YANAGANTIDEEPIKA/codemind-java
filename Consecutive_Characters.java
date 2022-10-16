import java.util.Scanner;
class Rev
{
    public static void count(String st)
    {
       int c=1,max=1;
       for(int i=0;i<st.length()-1;i++)
       {
           if(st.charAt(i)==st.charAt(i+1))
           {
               c++;
           }
           else
           {
               c=1;
           }
           if(max<c)
           {
               max=c;
           }
       }
       System.out.println(max);
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
      count(st);
    }
}