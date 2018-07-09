package array;
public class Non_prime 
{
public static int func(int arr[])
{
	int i,len=arr.length,c;
	int sum=arr[0]+arr[1];
	for(i=2;i<len;i++)
	{
		c=0;
		for(int j=1;j<len;j++)
		{
			if(i%j==0)
			{
				c++;
			}
		}
		if(c!=2)
		{
			sum+=arr[i];
		}
	}
	return sum;
}
	public static void main(String[] args) 
	{
	int[] arr= {10,20,30,40,50,60,70};
	System.out.println(func(arr));
 
	}

}
