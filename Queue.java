class Queue
{
    int ar[];
    int rear;
    int front;
    int cap;
    Queue(int size)
    {
        cap = size;
        ar = new int [size];
        rear = -1;
        front = -1;
    }
    public void enqueue(int n)
    {
        if(rear==cap)
        {
            System.out.println("Queue Overflow");
        }
        else
        {
            if(rear == -1)
            {
                front = 0;
            }
            ar[++rear] = n;
        }
    }
    public void dequeue()
    {
        if(rear == -1 || front > rear)
        {
            System.out.println("Queue Overflow");
        }
        else
        {
            System.out.println(ar[front++]+" is dequeued");
        }
    }
    public void display()
    {
        for(int i=front; i<=rear;i++)
        {
            System.out.println(ar[i]+" ");
        }
    }
    public static void main(String args[])
    {
        Queue q = new Queue(5);
        q.enqueue(12);
        q.enqueue(22);
        q.dequeue();
        q.enqueue(30);
        q.enqueue(2230);
        q.enqueue(11);
        q.display();
        
    }
}