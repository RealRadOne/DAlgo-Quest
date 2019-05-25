//Solution to LeetCode problem-Middle of the Linked List
//--Microsoft Problem #331
class Solution {
    public ListNode middleNode(ListNode head) 
    {
    int count=0;
    ListNode ptr=head;
    while(ptr!=null)
    {
        ptr=ptr.next;
        count++;
    }
    ptr=head;
    {
        for(int i=0;i<(count/2);i++)
            ptr=ptr.next;
    }
    return(ptr);
    }
}