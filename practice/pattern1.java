package practice;

import java.util.Scanner;

public class next_largest_num {

	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int row=in.nextInt(),i,j;
		for(i=1;i<=row;i++)
		{
			int k=i;
			for(j=1;j<=row;j++)
			{
				System.out.print(k);
				k++;
				if(k>row)
					k=1;
				}
			System.out.println("\n");
		}
		}	

	}
