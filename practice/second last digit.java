package Second;

import java.util.Scanner;

public class Second_last_digit
{
public static int func(int x)
{
	int r;
	if(x<0)
	{
	x=x*-1;
	}
	if(x>=10)
	{
	r=(x%100)/10;
	return r;
	}
	else 
		return -1;
}
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		System.out.println(func(x));
	}

}
