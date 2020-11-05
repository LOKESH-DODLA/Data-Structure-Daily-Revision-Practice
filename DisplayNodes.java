class DisplayNodes
{
    Node head;
    public void show()
    {
        Node temp = head;// Creating temporary variable to store value of head
        while(temp.next != null)//printing the values till the condition is true
        {
            System.out.print(temp.data+" ");//Print value  
            temp = temp.next;//increasing the addresss
        }
        System.out.print(temp.data+" ");//Printing last value
    }
}   