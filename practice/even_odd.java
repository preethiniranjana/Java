package even_odd;

public class Odd_even {
public static int func(int x)
{
	if(x%2==0)
return 2;
	else
		return 1;
}
	public static void main(String[] args)
	{
	System.out.println(func(10));
	System.out.println(func(9));
	System.out.println(func(0));
	}

}
