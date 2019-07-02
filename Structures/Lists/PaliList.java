//Checking for Palindrome List
//TestCases Passed-21/26
class Solution {
    public int sizes(ListNode head)
    {
        int count=0;
        ListNode ptr=head;
        while(ptr!=null)
        {
            count++;
            ptr=ptr.next;
        }
        return(count);
    }
    public boolean isPalindrome(ListNode head) 
    {
    ListNode ptr=head;
    ListNode chk=head;
    int len=sizes(head);
    for(int i=0;i<len/2;i++)
        chk=chk.next;
    if(len%2!=0)
        chk=chk.next;
    boolean ans=true;
    for(int i=0;i<len/2;i++)
    {
        if(ptr.val!=chk.val)
        {ans=false;break;}
        ptr=ptr.next;
        chk=chk.next;
    }
    return(ans);
    }
}