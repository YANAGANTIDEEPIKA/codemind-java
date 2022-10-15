import java.util.Scanner;
import java.util.Arrays;
class Split
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String st1=s.nextLine();
        String st2=s.nextLine();
        String st3=st1+st2;
       char ch[]=st3.toCharArray();
       Arrays.sort(ch);
       System.out.println(ch);
    }
}