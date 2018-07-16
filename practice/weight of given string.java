class GfG
{
public static void main(String args[])
{
String str1="Preethi";
char[] arr=str1.toCharArray();
int i,sum=0;
for(i=0;i<arr.length;i++)
{
if(arr[i]!='a' && arr[i]!='e' && arr[i]!='i' && arr[i]!='o' && arr[i]!='u' &&arr[i]!='A' && arr[i]!='E' && arr[i]!='I' && arr[i]!='O' && arr[i]!='U')
{
if(arr[i]>=65 && arr[i]<=90)
{
int b=(int)(arr[i])-64;
 sum=sum+b;
}
if(arr[i]>=97 && arr[i]<=122)
{
int b=(int)(arr[i])-96;
 sum=sum+b;
}

   
}
}
if(sum%9==0)
{
   System.out.println("9"); 
    
}
else{
    System.out.println(sum%9);
}
}
} 
