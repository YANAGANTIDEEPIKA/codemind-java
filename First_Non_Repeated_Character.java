import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int k=0;k<n;k++)
        {
            int a=sc.nextInt();
            String s=sc.next();
            int l=s.length();
            int c=0,f=0;
            for(int i=0;i<a;i++)
            {
                c=0;
                for(int j=0;j<a;j++)
                {
                    if(s.charAt(i)==s.charAt(j))
                    {
                        c++;
                    }
                }
            if(c==1)
            {
                System.out.println(s.charAt(i));
                f=1;
                break;
            }
        }
        if(f==0)
        {
            System.out.println("-1");
        }
    }
}
}