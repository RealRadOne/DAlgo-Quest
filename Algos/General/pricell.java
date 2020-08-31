class Solution 
{
    public int[] prisonAfterNDays(int[] cells, int N) 
    {
       int n=cells.length;
       if(N%14!=0)
           N=N%14;
       else
           N=14;
       for(int i=0;i<N;i++)
       {
           int prev=cells[0];
           cells[0]=0;
           for(int j=1;j<7;j++)
           {
               int temp=cells[j];
               if((prev^cells[j+1])==0)
                   cells[j]=1;
               else
                   cells[j]=0;
               prev=temp;
           }
           cells[7]=0;
       }
        return cells;
    }
}
