//Microsoft problem-Is Binary Number Multiple of 3
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static int pows(int a,int b)
    {
        int num=1;
        for(int i=0;i<b;i++)
        num=num*a;
        return(num);
    }
	public static void main (String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int f=sc.nextInt();
	    for(int i=0;i<f;i++)
	    {
	    String s=sc.nextLine();
	    int t=0;
	    int c=0;
	    for(int j=0;j<s.length();j++)
	    {
	     if(s.charAt(j)==1)
	     t=t+pows(2,c);
	     c++;
	    }
	    System.out.println(t);
	    if(t%3==0)
	    System.out.println(1);
	    else
	    System.out.println(0);
	    }
	}
}