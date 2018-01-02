import java.util.Scanner;
class Factorial_rec
{
	public static void main(String arg[])
	{
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int result=fact(num);
		System.out.println(result);
	}
	static int fact(int num)
	{
		if(num<=1)
		{
			return 1;
		}
		else
		return num*fact(num-1);
	}
}
