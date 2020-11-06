class DoublyLinkedList
{
    Node head;
    public void push(int n)
    {
        Node node  = new Node();
        node.data = n;
        node.next = head;
        node.prev = null;
        if(head != null)
        {
            head.prev = node;
        }
        head = node;
    }
    
    public void insertAfter(Node prev_Node , int d)
    {
        if(prev_Node == null)
        {
            System.out.println("Not Found");
        }
        Node newNode = new Node();
        newNode.data = d;
        newNode. next = prev_Node.next;
        prev_Node.next = newNode;
        newNode.prev = prev_Node;
        if(newNode.next != null)
        {
            newNode.next.prev = newNode;
        }
    }
    
    public void append(int data)
    {
        Node new_node = new Node();
        new_node.data = data;
        new_node.next = null;
        Node temp = head;
        if(head == null)
        {
            new_node.prev = null;
            head = new_node;
        }
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = new_node;
        new_node.prev = temp;
    }
    
    public void display()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.println(temp.data+" ");
            temp = temp.next;
            
        }
    }
}