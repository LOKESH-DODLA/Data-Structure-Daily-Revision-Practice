class CircularLinkedList
{
    static Node addToEmpty(Node head , int data)
    {
        if(head != null)
        {
            return head;
        }
        Node temp = new Node();
        temp.data = data;
        head = temp;
        head.next = head;
        return head;
    }
    static Node addBegin(Node head , int data)
    {
        if(head == null)
        {
            return addToEmpty(head , data);
        }
        Node temp = new Node();
        temp.data = data;
        temp.next = temp;
        head = temp;
        return head;
    }
    static Node addAfter(Node head , int data , int item)
    {
        if(head == null)
        {
            return null;
        }
        Node temp , p;
        p = head.next;
        do
        {
            if(p.data == item)
            {
                temp = new Node();
                temp.data = data;
                temp.next = p.next;
                p.next = temp;
                if(p == head)
                {
                    head = temp;
                }
                return head;
            }
            p = p.next;
        }while(p!=head.next);
        System.out.println("Item not present");
        return head;
    }
    static void display(Node head)
    {
        Node p;
        if(head == null)
        {
            System.out.println("Empty...");
            return;
        }
        p = head.next;
        do
        {
            System.out.print(p.data+" ");
            p=p.next;
        }while(p!= head.next);
    }
}
            