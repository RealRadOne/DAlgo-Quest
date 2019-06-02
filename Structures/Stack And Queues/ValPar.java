//Checking for Valid Parenthesis
//Testcases Passed-76/76
class Solution 
{
    public boolean isValid(String s) 
    {
    if(s=="")
    return(true);
    if(s.length()==1)
    return(false);
    char ans[]=new char[s.length()];
    int top=-1;
    for(int i=0;i<s.length();i++)
    {
        if(s.charAt(i)=='(' || s.charAt(i)=='{' ||s.charAt(i)=='[')
        {top++;ans[top]=s.charAt(i);}
        if(s.charAt(i)==')')
        {
            if(top==-1 || ans[top]!='(')
            {return(false);}
            else
                top--;
        }
        if(s.charAt(i)=='}')
        {
            if(top==-1 || ans[top]!='{')
            {return(false);}
            else
                top--;
        }
         if(s.charAt(i)==']')
        {
            if(top==-1 || ans[top]!='[')
            {return(false);}
            else
                top--;
        }
    }
    if(top!=-1)
    return(false);
    else
    return(true);
    }
}