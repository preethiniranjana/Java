package palindromeswap;

public class Palindrome 
{
public static boolean palin(String arr)
{
	char[] str=arr.toCharArray();
	int len=arr.length(),i,diffcount=0;
	char[][] diff=new char[2][2];
	for(i=0;i<len/2;i++)
	{
		if(str[i]!=str[len-i-1])
		{
			if(diffcount==2)
				return false;
			diff[diffcount][0]=str[i];
			diff[diffcount++][1]=str[len-i-1];
		}
	}
	switch(diffcount)
	{
	case 0:
		return true;
	case 1:
		char mid=str[i];
		if(len%2!=0 &&(diff[0][0]==mid || diff[0][1]==mid))
	    return true;
	case 2:
		if((diff[0][0]==diff[1][1] && diff[1][0]==diff[0][1]) ||(diff[0][0]==diff[1][0] && diff[1][1]==diff[0][1]))
			return true;
	}
	return false;
}
	public static void main(String[] args) 
	{
	System.out.println(palin("bbg"));
	System.out.println(palin("bdababd"));
    System.out.println(palin("gcagac"));
	}

}
