//Check out goldmine flipkart interview question on GOG
import java.util.*;
import java.io.*;
//import java.Math.*;
public class goldmine
{
	int m,n;
	goldmine(int m,int n)
	{
		this.m=m;
		this.n=n;
	}
	public int calcpath(int a[][],int i,int j,int b[][])
	{
	if(i<m&&j<n)
	{
            if(b[i][j]==0)
            {		
			int path1=Math.max(calcpath(a,i,j+1,b),calcpath(a,i+1,j,b));
			int path2=Math.max(path1,calcpath(a,i+1,j+1,b));
			b[i][j]=Math.max(path1,path2)+a[i][j];
			System.out.println(b[i][j]);
			return(b[i][j]);
		    }
		    else
		    	return(b[i][j]);
	}
	return(0);
	}
	public static void main(String args[])
	{
		Random rand=new Random();
		//Assigning random integers in the matrix
		int m=3,n=3;
		int a[][]=new int[m][n];
		int b[][]=new int[m][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
				a[i][j]=i+j;
		}
		goldmine jg=new goldmine(m,n);
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				b[i][j]=0;
			}
		}
		jg.calcpath(a,0,0,b);
		System.out.println("The max gold collected is:"+a[0][0]);
		/*
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
				System.out.println(b[i][j]+" ");
			//System.out.println("\n");
		}
		*/
	}
}