class Stack
{
    int ar[];
    int top;
    int cap;
    Stack (int size)
    {
        ar=new int [size];
        top=-1;
        cap=size;
    }

    public void push(int n)
    {
        if(top == cap-1)
        {
            System.out.println("Stack Overflow");
        }
        else
        {
            ar[++top] = n;
        }
    }

    public void pop()
    {
        if(top == -1)
        {
            System.out.println("Stack Underflow");
        }
        else
        {
            System.out.println(ar[top--]+ " is popped ");
        }
    }

    public void display ()
    {
            System.out.println("Elements");
        for(int i=0;i<=top;i++)
        {
            System.out.println(ar[i]+ " ");
        }
    }
    
    public static void main(String args[])
    {
        Stack s=new Stack(5);
        s.push(10);
        s.push(20);
        s.pop();
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.pop();
        s.display();
    }
}

    