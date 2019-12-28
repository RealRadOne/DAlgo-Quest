/*
Given a 2d grid map of '1's (land) and '0's (water), 
count the number of islands. An island is surrounded 
by water and is formed by connecting adjacent lands 
horizontally or vertically. You may assume all four 
edges of the grid are all surrounded by water.
Example 1:
Input:
11110
11010
11000
00000
Output 1:1:
*/
class Solution 
{
    public void trav(char[][] grid,int i,int j)
    {
     if(i<grid.length && j<grid[0].length && i>=0 && j>=0 && grid[i][j]=='1')
     {
     grid[i][j]='0';
     trav(grid,i+1,j);
     trav(grid,i-1,j);
     trav(grid,i,j+1);
     trav(grid,i,j-1);
     }
    }
    public int numIslands(char[][] grid)
    {
    //List<Integer>visi=new ArrayList<Integer>();
    int num=0;
    for(int i=0;i<grid.length;i++)
    {
        for(int j=0;j<grid[0].length;j++)
        {
            if(grid[i][j]=='1')
            {
                System.out.println(i+"**"+j);
                trav(grid,i,j);
                num++;
            }
        }
    }
    //System.out.println(visi.toString());
    return num;
    }
}