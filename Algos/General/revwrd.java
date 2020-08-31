class Solution 
{
    public String reverseWords(String s) 
    {
        s=s.strip();
        String ans="";
        String cur="";
        for(int i=s.length()-1;i>-1;i--)
        {
            if(s.charAt(i)==' ')
            {
                if(cur=="")
                    continue;
                StringBuffer sb=new StringBuffer(cur);
                sb.reverse();
                ans=ans+sb.toString()+" ";
                cur="";
            }
            else
                cur=cur+s.charAt(i);
        }
        StringBuffer sb=new StringBuffer(cur);
        sb.reverse();
        ans=ans+sb.toString();
        return ans;
    }
}
