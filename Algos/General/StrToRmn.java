class Solution 
{
    public String intToRoman(int num) 
    {
    String thou[]={"","M","MM","MMM"};
    String hund[]={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
    String tens[]={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
    String ones[]={"","I","II","III","IV","V","VI","VII","VIII","IX","X"};
    String ans=thou[(num/1000)]+hund[(num/100)%10]+tens[(num/10)%10]+ones[num%10];
    return(ans);
    }
}