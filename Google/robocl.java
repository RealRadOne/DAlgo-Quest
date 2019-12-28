/*
Given a robot cleaner in a room modeled as a grid.
Each cell in the grid can be empty or blocked.
The robot cleaner with 4 given APIs can move forward, turn left or turn right. Each turn it made is 90 degrees.
When it tries to move into a blocked cell, its bumper sensor detects the obstacle and it stays on the current cell.
Design an algorithm to clean the entire room using only the 4 given APIs shown below.
interface Robot {
  // returns true if next cell is open and robot moves into the cell.
  // returns false if next cell is obstacle and robot stays on the current cell.
  boolean move();
  // Robot will stay on the same cell after calling turnLeft/turnRight.
  // Each turn will be 90 degrees.
  void turnLeft();
  void turnRight();
  // Clean the current cell.
  void clean();
}
Example:
Input:
room = [
  [1,1,1,1,1,0,1,1],
  [1,1,1,1,1,0,1,1],
  [1,0,1,1,1,1,1,1],
  [0,0,0,1,0,0,0,0],
  [1,1,1,1,1,1,1,1]
],
row = 1,
col = 3
*/
class Solution
{
    private static final int[][] dirs= {{-1,0},{0,-1},{1,0},{0,1}};
    public void helptrav(Robot robot,HashSet<String>hash,int x,int y,int dir)
    {
        robot.clean();
        hash.add(x+","+y);
        for(int i=0;i<4;i++)
        {
            int nx=x+dirs[dir][0];
            int ny=y+dirs[dir][1];
            if(!hash.contains(nx+","+ny) && robot.move())
            {
                helptrav(robot,hash,nx,ny,dir);
            }
            robot.turnRight();
            dir++;
            dir %= 4;
        }
        robot.turnRight();
        robot.turnRight();
        robot.move();
        robot.turnRight();
        robot.turnRight();
    }
    public void cleanRoom(Robot robot) 
    {
       HashSet<String> hash = new HashSet<String>();
       helptrav(robot,hash,0,0,0);
    }
}