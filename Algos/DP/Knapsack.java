//KnapSack Problem by DP
import java.io.*;
import java.util.*;
public class Knapsack
{
	static int maxs(int a,int b)
    {
      if(a>b)
      return a;
      else
      return b;
    }
    static int ksack(int k, int[] arr,int[] val) 
    {
      int a[][]=new int[arr.length][k+1];
      a[0][arr[0]]=val[0];
      for(int i=1;i<arr.length;i++)
      {
        for(int j=1;j<k;j++)
        {
          if(j-arr[i]<0)
          	a[i][j]=0;
          else
          {
          a[i][j]=maxs(a[i-1][j],a[i-1][j-arr[i]]+val[i]);
          System.out.print(a[i][j]+"**");
          }
        }
         System.out.println("&&");
      }
      System.out.println(a[arr.length-1][k-1]);
      return(a[arr.length-1][k-1]);
    }
	public static void main(String args[])
	{
		int n,k;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the max weight of knapsack:");
		k=sc.nextInt();
		System.out.println("Enter the number of items:");
		n=sc.nextInt();
		int arr[]=new int[n];
		int val[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the weight and value of items");
			arr[i]=sc.nextInt();
			val[i]=sc.nextInt();
		}
		int maxval=ksack(k,arr,val);
	}
}