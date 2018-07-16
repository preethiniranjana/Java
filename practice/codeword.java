class GfG
{
public static void main(String args[])
{
int a = 123;
	int b = 456;
	int c=  789;
	int[] arr=new int[50];
	char p=0,q=0,o=0;
	String str1 = Integer.toString(a);
	String str2 = Integer.toString(b);
	String str3 = Integer.toString(c);
	for(int i=0;i<str1.length();i++)
	{
	char g=str1.charAt(i);
	char h=str2.charAt(i);
	char k=str3.charAt(i);
	if(g>h && g>k)
     p=g;
	else if(h>k && h>g)
    q=h;
	else
    o=k;
	}
	if(p>q && p>o)
    
	System.out.print(p);
	else if(q>p && q>o)
    
 	System.out.print(q);
	else
    
	System.out.print(o);
	
	for(int i=0;i<str1.length();i++)
	{
	char g=str1.charAt(i);
	char h=str2.charAt(i);
	char k=str3.charAt(i);
    if(g<h && g<k)
	System.out.print(g);
	else if(h<k && h<g)
	System.out.print(h);
	else
	System.out.print(k);
	}
}
} 
