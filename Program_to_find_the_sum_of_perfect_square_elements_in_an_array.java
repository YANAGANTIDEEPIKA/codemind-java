import java.util.*;
class Solution 
{
   public static boolean perf(int n)
    {
        for(int i=0;i*i<=n;i++)
        {
            if(i*i==n)
            {
                return true;
            }
        }
        return false;
    }
 public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int sum=0;
       // Solution s=new Solution();
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int k=a[i];
            if(perf(k))
            {
                sum=sum+k;
            }
        }
        System.out.println(sum);
        
    }
}