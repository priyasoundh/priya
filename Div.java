import java.util.*;
public class Div
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    int a,b,c,d;
	    a=sc.nextInt();
	    b=sc.nextInt();
	    c=sc.nextInt();
	    d=a*b;
	    d=d%c;
		System.out.println(d);
	}
}
