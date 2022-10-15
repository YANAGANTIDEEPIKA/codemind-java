import java.util.Scanner;
class string {
    public static boolean pallin(String st)
    {
        int len=st.length()-1;
        int i=0,j=len;
        while(i<j)
        {
           if(st.charAt(i)!=st.charAt(j))
           {
               return false;
           }
           i++;
           j--;
        }
       return true; 
    }
	    public static void main(String args[])
	    {
	        Scanner s=new Scanner(System.in);
	      int t=s.nextInt();
	      s.nextLine();
	      for(int i=0;i<t;i++)
	      {
	          String st=s.nextLine();
	         // System.out.println(st);
	          int le=st.length();
	          if(le%2==0 && pallin(st))
	              System.out.println("YES EVEN");
	          else if(le%2!=0 && pallin(st))
	              System.out.println("YES ODD");
	          else
	              System.out.println("NO");
	      }
	    }
}
