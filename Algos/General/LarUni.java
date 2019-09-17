//Largest Unique Number
class Solution 
{
    public int largestUniqueNumber(int[] A)
    {
    Arrays.sort(A);
    int ans=A[A.length-1];
    if(A.length==1)
        return(ans);
    int flag=0;
    for(int i=A.length-2;i>-1;i--)
    {
        if(ans==A[i])
        {flag=1;}
        if(ans!=A[i] && flag==0)
        {break;}
        if(ans!=A[i] && flag==1)
        {ans=A[i];flag=0;}
    }
    if(flag==0)
        return(ans);
    else
        return(-1);
    }
}