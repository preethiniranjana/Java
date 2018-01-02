import java.util.Scanner;
class Power
{
	public static void main (String[] args)
	{
     Scanner input=new Scanner(System.in);
     int base=input.nextInt();
     int pow=input.nextInt();
     long result=1;
        while (pow!= 0)
        {
            result *= base;
            --pow;
        }

        System.out.println(result);
    }
}
