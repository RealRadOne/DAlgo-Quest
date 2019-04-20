import java.util.*;
import java.io.*;
class tileprob
{
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter big tile width");
		n=sc.nextInt();
		if(n==1)
			{System.out.println(1);System.exit(0);}
		if(n==2)
			{System.out.println(2);System.exit(0);}
		int a[]=new int[n];
		int prev1=1;
		int prev2=2;
		int sum=0;
		for(int i=2;i<n;i++)
		{
			sum=prev1+prev2;
			prev1=prev2;
			prev2=sum;
		}
		System.out.println(sum);
	}
}