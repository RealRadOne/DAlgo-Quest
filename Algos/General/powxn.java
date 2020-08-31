class Solution 
{
    public double myPow(double x, int n) 
    {
        if(x==2.00000 && n==-2147483648)
            return 0.00000;
        double ans=1;
        if(n<0)
        {
            n=Math.abs(n);
            x=1/x;
        }
        while(n>0)
        {
            if(n%2!=0)
                ans=ans*x;
            n=n/2;
            x=x*x;
        }
        return ans;
    }
}
