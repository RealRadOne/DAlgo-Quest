class Solution 
{
    public int islandPerimeter(int[][] grid) 
    {
        int sum=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]==1)
                {
                    int count=0;
                    if(i+1<grid.length && grid[i+1][j]==1)
                        count++;
                    if(i-1>-1 && grid[i-1][j]==1)
                        count++;
                    if(j+1<grid[i].length && grid[i][j+1]==1)
                        count++;
                    if(j-1>-1 && grid[i][j-1]==1)
                        count++;
                    sum=sum-count+4;
                }
                System.out.print(sum+" ");
            }
            System.out.println();
        }
        return sum;
    }
}
