package string_ptrrn;
import java.util.Scanner;
public class Str_ptn {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
	    int len=str.length();
		for(int i=0;i<len;i++)
		{
			int k=len-1-i;
			for(int j=0;j<len;j++)
			{
			if(i==j || j==k)
				System.out.print(str.charAt(i));
			else
				System.out.print(" ");
			}
			System.out.println("");
		}
	}

}
