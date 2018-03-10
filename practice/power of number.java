
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
	int l=1;
	for(int i=0;i<k;i++)
	{
		l=l*n;
	}
            System.out.println(l);
            }
	}
