import java.io.*;
import java.util.*;
//FloodFill on GOG and connected in a grid on Hackkerank
public class floodfill
{
	static int hellper(int[][] a,int i,int j,int count)
    {
        if(i<a.length && j<a[i].length)
        {
            if(a[i][j]==1)
            {
                a[i][j]=0;
                count=count+hellper(a,i+1,j,count)
                +hellper(a,i,j+1,count)
                +hellper(a,i+1,j+1,count);
                count=count+1;
                return(count);
            }
            else
            return(0);
        }
        return(0);
    }
	static int connectedCell(int[][] matrix) 
    {
    int stx=0,sty=0,count;
    int m=matrix.length;
    int n=matrix[0].length;
    for(int i=0;i<n;i++)
    {
        int flag=0;
        for(int j=0;j<m;j++)
        {
            if(matrix[i][j]==1)
            {
                stx=i;
                sty=j;
                //System.out.println(stx+"**"+sty);
                flag=1;
                break;
            }
        }
        if(flag==1)
        break;
    }
    count=hellper(matrix,stx,sty,0);
    return(count);
    }
	public static void main(String args[])
	{
		int i,j,count,m,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows and cols");
		m=sc.nextInt();
		n=sc.nextInt();
		int a[][]=new int[m][n];
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
				a[i][j]=sc.nextInt();
		}
		count=connectedCell(a);
		System.out.println(count);
	}
}