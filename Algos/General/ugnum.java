class Solution 
{
    public int nthUglyNumber(int n) 
    {
    if(n==0)
        return 0;
    int a[]=new int[n];
    a[0]=1;
    int k=0;
    int l=0;
    int m=0;
    for(int i=1;i<n;i++)
    {
        int can2=a[k]*2;
        int can3=a[l]*3;
        int can5=a[m]*5;
        //System.out.println(can2+"**"+can3+"**"+can5);
        int can=Math.min(can2,Math.min(can3,can5));
        a[i]=can;
        if(can==can2)
            k++;
        if(can==can3)
            l++;
        if(can==can5)
            m++;
    }
    return a[n-1];
    }
}
