package javatest;
import java.util.Scanner;
public class JavaTest
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
    String s=in.nextLine();
    String b=in.nextLine();
    String g="",s1="",s2="";
    
    int i;
    int m=in.nextInt();
  int n=in.nextInt();
    for(i=0;i<s.length();i++)
    {
      if(!s1.contains(String.valueOf(s.charAt(i))))
          s1+=String.valueOf(s.charAt(i));
    }
  for(i=0;i<b.length();i++)
    {
      if(!s2.contains(String.valueOf(b.charAt(i))))
          s2+=String.valueOf(b.charAt(i));
    }
 int l1=s1.length(),l2=s2.length();
    if(m==1 &&(n==0 || n==1))
    {
        for(i=0;i<l1;i++)
        {
            for(int j=0;j<l2;j++)
            {
                if(s1.charAt(i)==s2.charAt(j))
                  g+=s1.charAt(i);  
            }
        }
        for(i=0;i<l2;i++)
        {
            for(int j=0;j<l1;j++)
            {
                if(s2.charAt(i)==s1.charAt(j))
                  g+=s2.charAt(i);  
            }
        }
        if(n==0)
            System.out.println(g.toUpperCase());
        else
            System.out.println(g.toLowerCase());
    }
    else if(m==0 &&(n==0||n==1))
    {
        int c,c1;
        for(i=0;i<l1;i++)
        {
            c=0;
            for(int j=0;j<l2;j++)
            {
                if(s1.charAt(i)!=s2.charAt(j))
                    c++;
            }
            if(c==l2)
                g+=s1.charAt(i);
        }
        for(i=0;i<l2;i++)
        {
            c1=0;
            for(int j=0;j<l1;j++)
            {
                if(s2.charAt(i)!=s1.charAt(j))
                    c1++;
            }
            if(c1==l1)
                g+=s2.charAt(i);
        }
        if(n==0)
            System.out.println(g.toUpperCase());
        else
            System.out.println(g.toLowerCase());
    }
    }
    
}
