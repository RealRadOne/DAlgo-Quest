/*
This problem is an interactive problem new to the LeetCode platform.

We are given a word list of unique words, each word is 6 letters long, and one word in this list is chosen as secret.

You may call master.guess(word) to guess a word.  The guessed word should have type string and must be from the original list with 6 lowercase letters.

This function returns an integer type, representing the number of exact matches (value and position) of your guess to the secret word.  Also, if your guess is not in the given wordlist, it will return -1 instead.

For each test case, you have 10 guesses to guess the word. At the end of any number of calls, if you have made 10 or less calls to master.guess and at least one of these guesses was the secret, you pass the testcase.

Besides the example test case below, there will be 5 additional test cases, each with 100 words in the word list.  The letters of each word in those testcases were chosen independently at random from 'a' to 'z', such that every word in the given word lists is unique.

Example 1:
Input: secret = "acckzz", wordlist = ["acckzz","ccbazz","eiowzz","abcczz"]

Explanation:

master.guess("aaaaaa") returns -1, because "aaaaaa" is not in wordlist.
master.guess("acckzz") returns 6, because "acckzz" is secret and has all 6 matches.
master.guess("ccbazz") returns 3, because "ccbazz" has 3 matches.
master.guess("eiowzz") returns 2, because "eiowzz" has 2 matches.
master.guess("abcczz") returns 4, because "abcczz" has 4 matches.

We made 5 calls to master.guess and one of them was the secret, so we pass the test case.
*/
/**
 * // This is the Master's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface Master {
 *     public int guess(String word) {}
 * }
 */
class Solution 
{
    public int scores(String str1,String str2)
    {
        int count=0;
        for(int i=0;i<str1.length();i++)
            if(str1.charAt(i)==str2.charAt(i))
                count++;
        return count;
    }
    public List<String> updates(List<String>words,int score,String cur)
    {
        List<String>rets=new ArrayList<String>();
        for(int i=0;i<words.size();i++)
        {
            if(scores(words.get(i),cur)==score)
                rets.add(words.get(i));
        }
        return rets;
    }
    public void findSecretWord(String[] wordlist, Master master) 
    {
     Arrays.sort(wordlist);
     List<String>words=new ArrayList<String>();
     for(int i=0;i<wordlist.length;i++)
         words.add(wordlist[i]);
     int guess=0;
     for(int i=0;i<10 && guess!=6;i++)
     {
      guess=master.guess(words.get(0));
      words=updates(words,guess,words.get(0));
     }
    }
}