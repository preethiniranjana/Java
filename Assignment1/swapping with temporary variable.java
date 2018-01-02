import java.util.Scanner;
class swap
{
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		int y=in.nextInt();
		int temp;
		System.out.println("Before swapping " +x+" "+y);
		temp=x;
		x=y;
		y=temp;
			System.out.println("After swapping "+x+" "+y);
		}
}
