import java.util.*;
import java.lang.*;
import java.io.*;
class Exists
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
	    int i,count=0;
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    int e[]=new int[a];
	    for(i=0;i<a;i++)
	    {
	        e[i]=sc.nextInt();
	        if(e[i]==b)
	        {
	            count=count+1;
	        }
	    }
	    if(count>0)
	    {
	        System.out.println("yes");
	    }
	    else
	    {
	        System.out.println("no");
	    }
	}
}
