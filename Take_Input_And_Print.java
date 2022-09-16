import java.util.Scanner;
class Print
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    String s="";
    s+=sc.nextLine();//nextLine gives upto the nextline occurs
    System.out.println(s);
    sc.close();
}
}