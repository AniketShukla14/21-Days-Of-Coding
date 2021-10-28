// reverse a linked list.
class Solution
{
    Node reverseList(Node head)
    {
        // code here
        Node prev=null;
        Node next=null;
        Node current=head;
        while(current!=null)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
            
        }
        head=prev;
        return head;
    }
}