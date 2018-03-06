import java.util.*;
import java.util.Scanner;
class sum
{
	public static void main (String[] args) 
	{
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int k=in.nextInt();
	int[] a=new int[10];
	for(int i=1;i<=n;i++)
	{
	a[i]=in.nextInt();
	}
	for(int i=1;i<=n;i++)
	{
	if(i==k)
	{
		System.out.println(a[i]);
	}
}
}}
