
class Solution
{
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) 
    {
         // Your code here
        Node temp=head;
              HashSet<Integer> hs = new HashSet<Integer>();
        Node prev = head;
        
        while(temp != null ){
            if(!hs.contains(temp.data)){
                hs.add(temp.data);
                prev = temp;
                temp = temp.next;
            }else{
                prev.next = temp.next;
                temp = temp.next;
            }
        }
        return head;
    }
}