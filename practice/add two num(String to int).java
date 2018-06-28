package string_int;

import java.util.Scanner;

public class Add_str_int 
{
public static String func(String x,String y)
{
	int num1=Integer.parseInt(x);
	int num2=Integer.parseInt(y);
  String n=Integer.toString(num1+num2);
return 	n;
}
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	String x=s.nextLine();
	String y=s.nextLine();
	System.out.println(func(x,y));

	}

}
