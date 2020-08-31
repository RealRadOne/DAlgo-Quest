class Solution 
{
    public Node helpb(Node head)
    {
        Node temp=head.next;
        if(head.child!=null)
        {
            head.next=head.child;
            head.child.prev=head;
            Node cur=helpb(head.child);
            head.child=null;
            if(temp==null)
                return cur;
            cur.next=temp;
            temp.prev=cur;
        }
        if(temp==null)
            return head;
        return helpb(temp);
    }
    public Node flatten(Node head) 
    {
        if(head==null)
            return null;
        helpb(head);
        return head;
    }
}
