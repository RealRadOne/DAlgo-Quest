//LeetCode Problem-Add two liked lists
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public static int pows(int num1,int num2)
    {
        int ans=1;
        for(int i=0;i<num2;i++)
        {
            ans=ans*num1;
        }
        return(ans);
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
    ListNode ptr1=l1;
    ListNode ptr2=l2;
    int sum=0;
    int count=0;
    while(ptr1!=null && ptr2!=null)
    {
        int num1=0;
        int num2=0;
        if(ptr1!=null)
           num1=ptr1.val*pows(10,count);
        else
            num1=0;
        if(ptr2!=null)
            num2=ptr2.val*pows(10,count);
        else
            num2=0;
        sum=sum+num1+num2;
        ptr1.val=(sum/(pows(10,count)))%10;
        count++;
        ptr1=ptr1.next;
        ptr2=ptr2.next;
    }
    System.out.println(sum);
    return(l1);
    }
}