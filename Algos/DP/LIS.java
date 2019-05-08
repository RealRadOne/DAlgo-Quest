import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    static int maxm(int a,int b)
    {
      if(a>b)
      return(a);
      else
      return(b);
    }
    // Complete the longestIncreasingSubsequence function below.
    static int longestIncreasingSubsequence(int[] arr) 
    {
      int lis[]=new int[arr.length];
      for(int i=0;i<arr.length;i++)
      {
        lis[i]=1;
      }
      for(int i=1;i<arr.length;i++)
      {
        if(arr[0]>arr[i])
        //System.out.println(arr[0]+"**"+arr[i]);
        {lis[0]=maxm(lis[0],lis[i]+1);}
      }
      System.out.println(lis[0]);
      int max=-99;
      for(int i=1;i<arr.length;i++)
      {
        for(int j=0;j<i+1;j++)
        {
          //System.out.println(arr[i]+"**"+arr[j]);
          if(arr[i]>arr[j])
          {lis[i]=maxm(lis[j]+1,lis[i]);}
        }
        System.out.println(lis[i]);
        if(max<lis[i])
        max=lis[i];
      }
      return(max);
    }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of numbers");
    int n=sc.nextInt();
    int arr=new int[n];
    System.out.println("Enter the numbers");
    for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
    int result=longestIncreasingSubsequence(arr);
    System.out.println("The longestIncreasingSubsequence length is:"+result); 
  }
}
