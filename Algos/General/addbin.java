class Solution
{
    public String addBinary(String a, String b)
    {
        int lena=a.length()-1;
        int lenb=b.length()-1;
        int carry=0;
        StringBuffer ans=new StringBuffer();
        while(lena>=0 || lenb>=0)
        {
            int sum=carry;
            if(lena>=0)
                sum=sum+a.charAt(lena)-'0';
            if(lenb>=0)
                sum=sum+b.charAt(lenb)-'0';
            ans.append(sum%2);
            carry=sum/2;
            lena=lena-1;
            lenb=lenb-1;
        }
        if(carry!=0)
            ans.append(carry);
        String s=ans.reverse().toString();
        return s;
    }
}
