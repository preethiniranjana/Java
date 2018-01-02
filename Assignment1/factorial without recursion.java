import java.util.Scanner;
class Factorial_without_rec
{
	public static void main(String arg[])
	{
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int i,fact=1;
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
}
