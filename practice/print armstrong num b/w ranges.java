import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int k=in.nextInt();
	int i,b,temp,r=0;
            for(i=n;i<k;i++)
            {
            temp=i;
            r=0;
            while(temp!=0)
            {
               b=temp%10;
               r=r+(b*b*b);
               temp/=10;
            }
            if(i==r)
            System.out.println(r);
            }
            }
	}
