class ConcatenatingNodes
{
    Node concatenating(Node head1 , Node head2)
    {
        Node temp = head1;
        while(temp != null)
        {
            temp = temp.next;
        }
        temp.next = head2;
        return temp;
    }
}