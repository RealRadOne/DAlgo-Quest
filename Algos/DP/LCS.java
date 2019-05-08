//Code finds LCS Length.To be optimised for returning String
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LCS
{
    static int maxs(int a,int b)
    {
      if(a>b)
      return a;
      else
      return b;
    }
    static int mins(int a,int b)
    {
      if(a>b)
      return b;
      else
      return a;
    }
    // Complete the longestCommonSubsequence function below.
    static int longestCommonSubsequence(int[] a, int[] b)
    {
      int m=a.length;
      int n=b.length;
      int status[][]=new int[m+1][n+1];
      int answ[]=new int[mins(m,n)];
      for(int i=0;i<a.length+1;i++)
      {
        status[i][0]=0;
      }
      for(int j=0;j<b.length+1;j++)
      {
        status[0][j]=0;
      }
      //int count=0;
      for(int i=0;i<m;i++)
      {
      for(int j=0;j<n;j++)
      {
      if(a[i]==b[j])
      {
      status[i+1][j+1]=status[i][j]+1;
      //answ[i]=a[i];
      }
      else
      status[i+1][j+1]=maxs(status[i][j+1],status[i+1][j]);
      }
      }
      System.out.println(status[m][n]);
      return(status[m][n]);
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter m and n");
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println("Enter the numbers");
        int a[]=new int[m];
        int b[]=new int[n];
        for(int i=0;i<m;i++)
        {
        	a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
        	b[i]=sc.nextInt();
        }
        int result=longestCommonSubsequence(a,b);
    }
}
