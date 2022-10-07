import java.util.Scanner;
class Sum
{
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        String t=s.nextLine();
        int c=t.length();
        if(c==10 && t.charAt(0)!='0')
        System.out.println("Valid");
        else
        System.out.println("Invalid");
    }
}