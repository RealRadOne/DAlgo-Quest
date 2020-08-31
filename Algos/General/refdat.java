class Solution
{
    public String reformatDate(String date) 
    {
        String cur[]=date.split(" ");
        String months[]={"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String ans="";
        ans=ans+cur[2]+"-";
        for(int i=0;i<9;i++)
        {
            if(cur[1].equals(months[i]))
            {
                ans=ans+"0"+(i+1)+"-";
                break;
            }
        }
        for(int i=9;i<12;i++)
        {
             if(cur[1].equals(months[i]))
            {
                ans=ans+(i+1)+"-";
                break;
            }
        }
        String add="";
        for(int i=0;i<cur[0].length();i++)
        {
            if(Character.isLetter(cur[0].charAt(i)))
                break;
            add=add+cur[0].charAt(i);
        }
        if(Integer.parseInt(add)<10)
            ans=ans+"0"+add;
        else
        ans=ans+add;
        return ans;
    }
}
