package Sum;

import java.util.Scanner;

public class Sum_of_last_digits
{
	public static int func(int x,int y)
	{
	int sum=0;
	if(x<0)
	{
		x=x*-1;
	}
	if(y<0)
	{ 
		y=y*-1;
	}
	sum=(x%10)+(y%10);
	return sum;
	}
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		int y=in.nextInt();
		System.out.println(func(x,y));

	}

}
