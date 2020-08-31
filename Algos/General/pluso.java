class Solution 
{
    public int[] plusOne(int[] digits) 
    {
        int carry=1;
        List<Integer>list=new ArrayList<Integer>();
        for(int i=digits.length-1;i>-1;i--)
        {
            int cur=(carry+digits[i])%10;
            carry=(carry+digits[i])/10;
            digits[i]=cur;
            list.add(digits[i]);
        }
        if(carry>0)
        {
            list.add(carry);
            int[] news=new int[list.size()];
            int ct=0;
            for(int i=list.size()-1;i>0;i--) 
            {
                news[ct]=list.get(i);
                ct++;
            }
            return news;
        }
        else
        return digits;
    }
}
