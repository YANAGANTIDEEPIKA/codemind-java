import java.util.Scanner;
class string {
	    public static void main(String args[])
	    {
	        Scanner s=new Scanner(System.in);
	      String st=s.nextLine();
	      int c=0;
	      for(int i=0;i<st.length();i++)
	      {
	          char ch=st.charAt(i);
	          if(ch>='0' && ch<='9')
	          {
	              c++;
	          }
	      }
	      if(c==0)
	      System.out.println("Doesn't contain digit");
	      else
	      System.out.println("Contains "+c+" digit");
	    }
}
