package num;
import java.util.Scanner;
import java.util.*;
public class Last_digit
{
public static int func(int x)
{
	int r;
		 r=x%10;
		return Math.abs(r);
}
	public static void main(String[] args)
	{
	Scanner in=new Scanner(System.in);
	int x=in.nextInt();
	System.out.println(func(x));
	}

}
