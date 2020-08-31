class Solution 
{
    public String thousandSeparator(int n) 
    {
        String ans="";
        if(n==0)
            ans=ans+"0";
        int c=0;
        while(n!=0)
        {
            ans=ans+(n%10);
            c++;
            if(c%3==0 && n/10>0)
                ans=ans+".";
            n=n/10;
        }
        StringBuffer sb=new StringBuffer(ans);
        ans=sb.reverse().toString();
        return ans;
    }
}
