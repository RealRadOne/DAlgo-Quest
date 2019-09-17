//The classic Stock-Buy Sell Problem
//All test cases passed on LeetCode

class Solution 
{
    public static int maxs(int a,int b)
    {
        if(a>b)
            return a;
        else
            return b;
    }
    public int maxProfit(int[] prices) 
    {
        if(prices.length==0 || prices.length==1)
            return(0);
        int dp[][]=new int[3][prices.length];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<prices.length;j++)
            {
                if(i==0 || j==0)
                    dp[i][j]=0;
                else
                {
                    int maxprof=0;
                    for(int k=0;k<j;k++)
                    {
                        if((prices[j]-prices[k])+dp[i-1][k]>maxprof)
                            maxprof=(prices[j]-prices[k])+dp[i-1][k];
                    }
                    dp[i][j]=maxs(dp[i][j-1],maxprof);
                    System.out.print(dp[i][j]+" ");
                }
            }
            System.out.println();
        }
        return(dp[2][prices.length-1]);
    }
}