package sum_series;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
	    int n=in.nextInt();
	    double y,sum=0;
	    for(int i=1;i<=n;i++)
	    {
	    	int f=1;
	    	for(int j=1;j<=i;j++)
	    	{
	    	f=f*j;
	    	}
	    	y=Math.pow(x,i);
	    	sum=sum+(y/f);
	    }
	    System.out.println(sum);
	}

}
