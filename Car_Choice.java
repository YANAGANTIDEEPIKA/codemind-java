import java.util.Scanner;
class Car
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++)
        {
            int x1,x2,y1,y2;
            x1=s.nextInt();x2=s.nextInt();y1=s.nextInt();y2=s.nextInt();
           // System.out.println(x1+"x1,x2"+x2+"y1"+y1+"y2"+y2);
            float c,d;
            c=(float)y1/x1;
            d=(float)y2/x2;
            if(c<d)
            System.out.println("-1");
           else if(c>d)
            System.out.println("1");
          else if(c==d)
            System.out.println("0");
        }
    }
}