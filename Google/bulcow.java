/*
You are playing the following Bulls and Cows game 
with your friend: You write down a number and ask 
your friend to guess what the number is. Each time your friend makes a guess, you provide a hint that indicates how many digits in said guess match your secret number exactly in both digit and position (called "bulls") and how many digits match the secret number but locate in the wrong position (called "cows"). Your friend will use successive guesses 
and hints to eventually derive the secret number.
Write a function to return a hint according to the 
secret number and friend's guess, use A to indicate 
the bulls and B to indicate the cows.
Please note that both secret number and friend's guess may contain duplicate digits.
*/
class Solution 
{
    public String getHint(String secret, String guess) 
    {
    HashMap<Character,Integer>hash=new HashMap<Character,Integer>();
    for(int i=0;i<secret.length();i++)
    {
        if(hash.containsKey(secret.charAt(i)))
        {
            int num=hash.get(secret.charAt(i));
            hash.put(secret.charAt(i),num+1);
        }
        else
        hash.put(secret.charAt(i),1);
    }
    System.out.println(hash.toString());
    int A=0;
    int B=0;
    for(int i=0;i<guess.length();i++)
    {
        if(hash.containsKey(guess.charAt(i)) && hash.get(guess.charAt(i))>0)
        {
            System.out.println(guess.charAt(i));
            if(guess.charAt(i)==secret.charAt(i))
            {
            A=A+1;
            int num=hash.get(guess.charAt(i));
            hash.put(guess.charAt(i),num-1);
            }
        }
    }
    for(int i=0;i<guess.length();i++)
    {
        if(hash.containsKey(guess.charAt(i)) && hash.get(guess.charAt(i))>0)
        {
            System.out.println(guess.charAt(i));
            if(guess.charAt(i)!=secret.charAt(i))
            {
            B=B+1;
            int num=hash.get(guess.charAt(i));
            hash.put(guess.charAt(i),num-1);
            }
        }
    }
    String ans=A+"A"+B+"B";
    return ans;
    }
}
/*
1,0  7 8 1 0
8,1  B A B B
0,2
7,3
*/