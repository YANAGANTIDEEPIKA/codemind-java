import java.util.Scanner;
class Vowel
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        if(a=='A'||a=='a'||a=='E'||a=='e'||a=='I'||a=='i'||a=='o'||a=='O'||a=='u'||a=='U')
        {
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("Consonant");
        }
    }
}