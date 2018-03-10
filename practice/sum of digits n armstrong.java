import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner in=new Scanner(System.in);
            int n=in.nextInt();
            int b,sum=0,temp=n,x=n,r=0;
            while(n!=0)
            {
     	      b=n%10;
    	      sum+=b;
    	      n/=10;
            }
            System.out.println(sum);
            while(x!=0)
            {
                    b=x%10;
                    r=r+(b*b*b);
                    x/=10;
            }
            if(temp==r)
            System.out.println("Armstrong number");
          else
          System.out.println("Not an Armstrong number");
	}
}
