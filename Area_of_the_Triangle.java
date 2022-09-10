import java.util.Scanner;
class Area{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        float a,b,c;
        double ar,su;
        a=s.nextFloat();b=s.nextFloat();c=s.nextFloat();
        su=(a+b+c)/2;
        ar=Math.sqrt(su*(su-a)*(su-b)*(su-c));
        System.out.format("%.2f",ar);
        s.close();
    }
}
