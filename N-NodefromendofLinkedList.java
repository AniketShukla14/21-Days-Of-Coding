class GfG
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
        Node temp=head;
    	int c=1,p=0;// Your code here	
    	while(head !=null)
    	{
    	    c++;
    	    head=head.next;
    	}
    	int d=1, q=(c-n)+1;
    	while(temp != null)
    	{
    	    d++;
    	    if(q==d)
    	    {
    	        p=1;
    	        break;
    	    }
    	    temp=temp.next;
    	}
    	if(p==1)
    	return temp.data;
    	else
    	return -1;
    }
}
