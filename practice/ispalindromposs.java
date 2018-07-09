import java.io.*;
import  java.util.*;
pakage java;
import java.util.Scanner;
class UserMainCode
{
	public int isPalinNumPossible(int input1)
        int count=0;
        int z=input1;
       while(z!=0)
        {
            z /= 10;
            count++;
        }
        int arr[]=new int[count],r=input1,i=0;
         while(r!=0)
        {
             arr[i]=r%10;
            r /= 10;
            i++;
        }
        if(count%2==0)
        {
         for(i=0;i<count;i++)
         {
             int flag=0;
             for(int j=0;j<count;j++)
             {
                 if(arr[i]==arr[j])
                 {
                     flag++;
                 }
             }
             if(flag%2!=0)
             {
                 return 1;
             }
         }
        }
        else
        {
            int odd=0;
            for(i=0;i<count;i++)
            {
            int flag[]=new int[count];
            flag[i]=0;
             for(int j=0;j<count;j++)
             {
                 if(arr[i]==arr[j])
                 {
                     flag[i]++;
                 }
             }
            if(flag[i]==1 )
            {
                odd++;
                if(odd>1) {
                        return 1;
                    }
            }
            }
        }
        return 2;	
	}
public static void main(String[] args)
	{
    Scanner s=new Scanner(System.in);
    int input1=s.nextInt();
    System.out.println(func(input1));
	}
  }
