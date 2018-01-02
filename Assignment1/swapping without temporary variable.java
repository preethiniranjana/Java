import java.util.Scanner;
class swap
{
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		int y=in.nextInt();
		System.out.println("Before swapping " +x+" "+y);
		x=x+y;
		y=x-y;
		x=x-y;
			System.out.println("After swapping "+x+" "+y);
		}
}
