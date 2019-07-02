//Minimum Path Sum of 2D Array
//All LeetCode Test Cases Passed
class Solution 
{
    public static int mins(int a,int b)
    {
        if(a>b)
            return b;
        else
            return a;
    }
    public int minPathSum(int[][] a) 
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                if(j==0 && i==0)
                    continue;
                else if(j==0 && i!=0)
                    a[i][j]=a[i-1][j]+a[i][j];
                else if(i==0 && j!=0)
                    a[i][j]=a[i][j-1]+a[i][j];
                else
                a[i][j]=mins(a[i-1][j],a[i][j-1])+a[i][j];
            }
        }
    return(a[a.length-1][a[0].length-1]);
    }
}