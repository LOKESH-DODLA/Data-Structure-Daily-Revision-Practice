class DeletingNode
{
    Node head;
    public void delete(int index)
    {
        if(index == 0)
        {
            head = head.next;//if it is the first location then simply move it to next node

        }
        else
        {
            Node n = head; //Storing the value of head in a temporary variable 
            Node n1 = null;//creating a dumb node to free the memory
            for(int i=0;i<index-1;i++)
            {
                n = n.next;//moving the pointer to the address of next node
            }
            n1 = n.next;//since we got the address of the deleted node we can store it in the dumb variable
            n.next = n1.next;//storing the address of the next node of the deleted node in the next of the previous node
            n1 = null;//free the memory allocation of the node
        }
    }
}