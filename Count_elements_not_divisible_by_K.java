import java.util.Scanner;
class Demo
{  
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
      int n=s.nextInt();int sn=s.nextInt();
      int[] a=new int[n];
      int c=0;
      for(int i=0;i<n;i++)
      {
          a[i]=s.nextInt();
          if(a[i]%sn!=0)
          {
              c++;
          }
      }
      System.out.println(c);
    }
}