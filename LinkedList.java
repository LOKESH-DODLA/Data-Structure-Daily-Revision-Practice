class LinkedList
{
    Node head;
    public void insert(int data)
    {
        Node node = new Node(); //Creating a new node
        node.data = data; //initialising value 
        node.next = null;//initialising a pointer as null
        if(head == null)//if there is no value stored in head which means it is empty
        {
            head = node;//then head is initialised as node
        }
        else
        {
            Node temp = head;// Creating a temporaray variable and initialising it with head in order to check the position where new node can be stored
            while(temp.next != null)// Finding position where we can store new node
            {
                temp = temp.next;//finding vacant position by swapping
            }
            temp.next = node;//after finding the position we store thw new node in it
        }
    }
    public void insertAtStart(int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }
    public void insertAt(int index , int data)
    {
        Node node  = new Node();
        node.data = data;
        node.next = null;
        if(index == 0)
        {
            insertAtStart(data);
             
        }
        else
        {
            Node temp = head;
            for(int i = 0;i<index-1;i++)
            {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
        }
    }
    public static void main(String args[])
    {
        LinkedList l1 = new LinkedList();
        l1.insert(23);
        l1.insert(22);
        l1.insert(30);
        LinkedList l2 = new LinkedList();
        l2.insert(3);
        l2.insert(2);
        l2.insert(4);

    }
}
