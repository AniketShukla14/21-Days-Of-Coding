
public static Node reverseDLL(Node  head)
{
    //Your code here
    Node prev=null;
    Node curr=head;

    while(curr !=null)
    {
         curr.prev=curr.next;
        curr.next=prev;
         prev=curr;
        curr=curr.prev;
    }
    return prev;
}