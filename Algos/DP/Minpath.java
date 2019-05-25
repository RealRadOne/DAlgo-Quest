//Unique Path Problem-LeetCode-DP62
import java.util.*;
class Minpath{
    public static int uniquePaths(int m, int n) 
    {
    int ans;
    if(m==1 && n==1)
    ans=1;
    else
    {
    int a [][]=new int[m][n];
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            if(i==0 && j==0)
            {a[i][j]=0;}
            else if(i==0 || j==0)
            {a[i][j]=1;}
            else
            {a[i][j]=a[i-1][j]+a[i][j-1];}
            //System.out.print(a[i][j]+" ");
        }
        //System.out.println();
    }
    ans=a[m-1][n-1];
    }
    return(ans);
    }
    public static void main(String args[])
    {
    	System.out.println("Enter m and n");
    	Scanner sc=new Scanner(System.in);
    	int m=sc.nextInt();
    	int n=sc.nextInt();
    	int ans=uniquePaths(m,n);
    	System.out.println(ans);
    }
}