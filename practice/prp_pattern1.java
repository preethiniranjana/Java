public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			int k=i,x=1;
			for(int j=1;j<=n;j++)
			{
				if(i<=j)
				{
				System.out.print(x+" ");
				x++;
				}
				else if(i>j)
				{
					System.out.print(k+" ");
				k--;
			}}
			System.out.println();
		}
		sc.close();	
	}

}
