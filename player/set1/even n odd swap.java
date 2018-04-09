
import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String aa[]) 
	{
	String s;
       char t;
       Scanner in=new Scanner(System.in);
       s=in.next();
       char a[]=s.toCharArray();
       for(int i=0;i<s.length();i+=2){
           t=a[i];
           a[i]=a[i+1];
           a[i+1]=t;

       }
      for(int i=0;i<s.length();i++){
          System.out.print(a[i]);
      }

	}
}
