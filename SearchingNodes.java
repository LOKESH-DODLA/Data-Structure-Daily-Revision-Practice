class SearchingNodes
{
    void searching(Node node , int num)
    {
        Node temp = node;//storing head in a temporary variable
        boolean found = false;
        while(temp != null)//traversing in linled list to move pointer to next node
        {
            if(temp.data == num)//if input number is found
            {
                System.out.println("Element Found");//print it
                found = true;
                break;//terminating loop
            }
            temp = temp.next;//moving to next location
        }
        if(found == false)
        {
            System.out.println("Element not Found");
        }
    }
}