package sum;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args)
	{
Scanner in=new Scanner(System.in);
int n=in.nextInt(),f,sum=0;
for(int i=1;i<=n;i++)
{
	f=1;
	for(int j=1;j<=i;j++)
	{
		f=f*j;
	}
	sum=sum+f;
}
System.out.println(sum);
}

}
