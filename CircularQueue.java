class CircularQueue
{
    int ar[];
    int rear;
    int front;
    int size;
    CircularQueue(int s)
    {
        rear = -1;
        front = -1;
        ar = new int[s];
        size = s;
    }
    void enqueue(int n)
    {
        if((front == 0 && rear == size-1) || front == rear + 1)
        {
            System.out.println("Queue Underflow");
        }
        else
        {
            if(front == -1)
            {
                front = 0;
            }
            rear = (rear+1)%size;
            ar[rear] = n;
        }
    }
    void dequeue() 
    {
        if(front == -1)
        {
            System.out.println("Queue Overflow");
        }
        else
        {
            System.out.println(ar[front]+" " );
            if(front == rear)
            {
                front = -1;
                rear = -1;
            }
            else
            {
                front = (front+1)%size;
            }
        }
    }
    void display()
    {
        if(front == -1)
        {
            System.out.println("Queue Empty");
        }
        else
        {
            for(int i=front; i!=rear;i++)
            {
                System.out.println(ar[i]+" ");
            }
        }
    }
}