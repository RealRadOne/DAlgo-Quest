//LeetCode-63
//Rotate List by k
//Code passes 220/231 test cases
class Solution {
    public static int flen(ListNode head)
    {
        ListNode ptr=head;
        int len=0;
        while(ptr!=null)
        {ptr=ptr.next;len++;}
        return(len);
    }
    public ListNode rotateRight(ListNode head, int k) 
    {
    if(head!=null)
    {
    ListNode kNode=head;
    ListNode Last=head;
    int len=flen(head);
    if(len<k)
        k=k-len;
    if(len==k)
        k=0;
    for(int i=0;i<len-k-1;i++)
        kNode=kNode.next;
    for(int i=0;i<len-1;i++)
        Last=Last.next;
    Last.next=head;
    head=kNode.next;
    kNode.next=null;
    }
    return(head);
    }
}