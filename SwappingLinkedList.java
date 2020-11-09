class SwappingLinkedList
{
    Node head;
    public void swapNodes(int x , int y)
    {
        if(x==y)//x is equal to y then nothing has to be done
        {
            return;
        }
        //searching for x while keeping track of prevX and currX
        Node prevX = null, currX = head;
        while(currX != null && currX.data == x) //loop will be executed till currX has a value and data in currX is equal to x
        {
            prevX = currX;//prevX store the currX node value 
            currX = currX.next;//pointing to address location
        }
        //searching for y while keeping track of prevX and currY 
        Node prevY = null, currY = head;
        while(currY != null && currY.data == y)//loop will be executed till currY has a value and data in currY is equal to y
        {
            prevY = currY;//stores value of currY 
            currY = currY.next;//pointing to next address
        }
        if(currX == null || currY == null)//inserted values are not found
        {
            return;
        }
        if(prevX !=null)//if x is not the head of the linked list
        {
            prevX.next = currY;//
        }
        else
        {
            head = currY;//making y as head
        }
        if(prevY != null)
        {
            prevY.next = currX;//
        }
        else
        {
            head = currX;//making x as head
        }
        //swaping the pointers
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
    }
}