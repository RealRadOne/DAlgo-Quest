//Problem-To get rid of all overlapping intervals
class Solution 
{
    public int eraseOverlapIntervals(int[][] intervals) 
    {
     if(intervals.length==0)
         return 0;
     Arrays.sort(intervals,new compare());
     int prev[]=intervals[0];
     int ans=0;
     for(int i=1;i<intervals.length;i++)
     {
         if(intervals[i][0]<prev[1])
         {
             ans++;
         if(intervals[i][1]<prev[1])
             prev=intervals[i];
         }
         else
             prev=intervals[i];
     }
        return ans;
    }
    class compare implements Comparator<int[]>{
        @Override
        public int compare(int[] a,int[] b)
        {
        if(a[0]!=b[0])return(a[0]-b[0]);
        else
            return(a[1]-b[1]);
        }
    }
}