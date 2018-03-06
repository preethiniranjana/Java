import java.util.*;
import java.util.Scanner;
class sum
{
	public static void main (String[] args) 
	{
	Scanner in=new Scanner(System.in);
	int[] a=new int[20];
	int sum=0;
	for(int i=0;i<4;i++)
	{
		a[i]=in.nextInt();
	}
	for(int n:a)
	{
		sum+=n;
	}
	System.out.println(sum);
	}
}
