import java.util.*;
import java.lang.*;
import java.io.*;
class Numeric
{
	public static void main (String[] args)
	{
	char d;
	Scanner in=new Scanner(System.in);
	d=in.next().charAt(0);
	if(d>='0'&&d<='9')
	{
		System.out.println("Yes");
	}
	else
	{
		System.out.println("No");
	}
	}
}
