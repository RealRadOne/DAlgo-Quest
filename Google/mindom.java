/*
In a row of dominoes, A[i] and B[i] 
represent the top and bottom halves of the i-th domino.  (A domino is a tile with two 
numbers from 1 to 6 - one on each half of the tile.)
We may rotate the i-th domino, so that A[i] and B[i] 
swap values.
Return the minimum number of rotations so that all the 
values in A are the same, or all the values in B are 
the same.
If it cannot be done, return -1.
*/
class Solution 
{
    public int chk(int num,int[] A,int[] B)
    {
        int ansa=0;
        int ansb=0;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]!=num && B[i]!=num)
            return -1;
            else if(A[i]!=num)
                ansa=ansa+1;
            else if(B[i]!=num)
                ansb=ansb+1;
        }
        return (Math.min(ansa,ansb));
    }
    public int minDominoRotations(int[] A, int[] B) 
    {
        int ra=chk(A[0],A,B);
        if(ra==-1)
        ra=chk(B[0],A,B);
        return ra;
    }
}