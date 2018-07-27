package arraymerge;

import java.util.Arrays;

public class Arr_merge {

	public static void main(String[] args) {
		int arr1[]={5,10,4,7,9,6,13,2},temp;
		int arr2[]= {5,11,2,4,6,7,8,9,3,15};
		int a[]=new int[100];
		int b[]=new int[100];
		for(int i=0;i<arr1.length;i++)
		{
			a[i]=arr1[i];
		}
		int s=arr1.length+arr2.length;
		for(int i=arr1.length,k=0;i<s && k<arr2.length;i++,k++)
		{
			a[i]=arr2[k];
		}
		for(int i=0;i<s;i++)
		{
			temp=0;
		for(int j=i+1;j<s;j++)
		{
			if(a[i]>a[j])
			{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			}
		}
		}
		int d=0;
		for(int i=0;i<s;i++)
		{
				if(a[i]!=a[i+1])
				{
					b[d++]=a[i];
				}
		}
		for(int i=0;i<d;i++)
		{
			System.out.print(b[i]+" ");
		}
	}

}
