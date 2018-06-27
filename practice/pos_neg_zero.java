package number;

public class Pos_neg_zero 
{
public static int func(int k)
{
if(k>0)
System.out.println("Positive");
else if(k<0)
	System.out.println("Negative");
else
	System.out.println("Zero");
return k;
}
	public static void main(String[] args)
	{
	System.out.println(func(10));
	System.out.println(func(-10));
	System.out.println(func(0));
	}

}
