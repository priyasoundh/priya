import java.util.*;
public class numeric
{
    public static void main(String []args)
    {
        int i,a=0;
        Scanner sc=new Scanner(System.in);
        String ss=sc.next();
        int n=ss.length();
        char[] s=new char[n];
        for(int j=0;j<n;j++)
        {
            s[j]=ss.charAt(j);
        }
        for(i=0;i<n;i++)
        {
            if((s[i]>='a')&&(s[i]<='z'))
            {
                a=a+1;
            }
        }
        if(a==0)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
     }
}
