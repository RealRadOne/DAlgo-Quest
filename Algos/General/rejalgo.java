class Solution extends SolBase 
{
    public int rand10() 
    {
        int a=rand7();
        int b=rand7();
        int num=a+(b-1)*7;
        if(num<=40)
        return (num-1)%10+1;
        else
        return rand10();
    }
}
