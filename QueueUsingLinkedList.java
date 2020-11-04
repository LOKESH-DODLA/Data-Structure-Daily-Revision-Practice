class QueueUsingLinkedList 
{
    
    QNode front , rear;
    QueueUsingLinkedList ()
    {
        front = null;
        rear = null;
    }
    void enqueue(int n)
    {
        QNode node = new QNode(n);
        if(rear == null)
        {
            front = node;
            rear = node;
        }
        rear.next = node;
        rear =  node;
    }
    void dequeue()
    {
        if(front == null)
        {
            return;
        }
        QNode node = front;
        System.out.println(node+" ");
        front = front.next;
        if(front == null)
        {
            rear = null;
        }
    }
    public static void main(String args[])
    {
        QueueUsingLinkedList q = new QueueUsingLinkedList ();
        q.enqueue(12);
        q.enqueue(22);
        q.dequeue();
        q.enqueue(30);
        q.enqueue(2230);
        q.dequeue();
        q.enqueue(11);
    }
}
