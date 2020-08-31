class Solution 
{
    public boolean detectCapitalUse(String word) 
    {
        boolean cap=false;
        boolean sml=false;
         if(word.charAt(0)-97>=0 && word.charAt(0)-97<27)
            sml=true;
        for(int i=1;i<word.length();i++)
        {
            if(word.charAt(i)-65>-1 && word.charAt(i)-65<27)
            {
                if(!sml)
                {
                    if(!cap)
                        cap=true;
                    else
                        continue;
                }
                else
                    return false;
            }
            if(word.charAt(i)-97>-1 && word.charAt(i)-97<27)
            {
                if(!cap)
                {
                    if(!sml)
                        sml=true;
                    else
                        continue;
                }
                else
                    return false;
            }
        }
        return true;
    }
}
