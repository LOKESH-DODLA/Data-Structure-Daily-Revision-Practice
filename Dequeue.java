class Dequeue
{
    int ar[];
    int rear;
    int front;
    int size;
    Dequeue(int s)
    {
        rear = -1;
        front = -1;
        ar = new int[s];
        size = s;
    }
    boolean isFull()
    {
        return ((front==0 && rear==size-1)||front == rear+1);
    }
    boolean isEmpty()
    {
        return (front == -1);
    }
    void insertFront(int n)
    {
        if(isFull())
        {
            System.out.println("Queue Overflow");
        }
        if(front==-1)
        {
            front =0;
            rear=0;
        }
        else if(front == 0)
        {
            front = size-1;
        }
        else
        {
            front = front - 1;
        }
        ar[front] = n;
    }
    void insertRear(int n )
    {
        if(isEmpty())
        {
            System.out.println("Queue Overflow");
        }
        if(front == -1)
        {
            front = 0;
            rear = 0;
        }
        else if(rear == size-1)
        {
            rear = 0;
        }
        else
        {
            rear = rear+1;
        }
        ar[rear] = n;
    }
    void deleteFront()
    {
        if(isEmpty())
        {
            System.out.println("Queue Underflow");
        }
        if(front == rear)
        {
            front = -1;
            rear = -1;
        }
        else if(front ==  size-1)
        {
            front = 0;
        }
        else
        {
            front = front+1;
        }
        System.out.print(ar[front]+" ");
        
    }
    void deleteRear()
    {
        if(isEmpty())
        {
            System.out.println("Queue Underflow");
        }
        if(front == rear)
        {
            front = -1;
            rear = -1;
        }
        else if(rear == 0)
        {
            rear = size-1;
        }
        else
        {
            rear = rear - 1;
        }
        System.out.print(ar[rear]+ " ");
        
    }
}