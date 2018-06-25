import java.util.*;
import java.lang.*;
import java.io.*;

class Pairsum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int sum=in.nextInt(),temp,count=0;
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
		temp=a[i]+a[j];	
		if(sum==temp)
		{
		System.out.println("("+a[i]+","+a[j]+")");
		count++;
		}
		}
	}
	if(count==0)
	{
		System.out.println("-1");
	}
	}
}
