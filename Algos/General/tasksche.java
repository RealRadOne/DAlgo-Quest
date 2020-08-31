class Solution 
{
    public int leastInterval(char[] tasks, int n) 
    {
     int[] map=new int[26];
     for(int i=0;i<tasks.length;i++)
     {
         map[tasks[i]-'A']++;
     }
     Arrays.sort(map);
     int max  = map[25]-1;
     int idle = max*n;
     //System.out.println(max+"**"+idle);
     for(int i=24;i>-1;i--)
     {
         idle=idle-Math.min(max,map[i]);
     }
     if(idle>0)
     return tasks.length+idle;
     else
     return tasks.length;
    }
}
