
class GfG
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
	// Your code here	
	Node curr=head.next;
	Node prev=head;
	while(curr!=null)
	{
	    if(prev.data==curr.data)
	    {
	       prev.next=curr.next;
	   curr=curr.next;
	   continue;
	    }
	    prev=curr;
	    curr=curr.next;
	}
	return head;
    }
}
