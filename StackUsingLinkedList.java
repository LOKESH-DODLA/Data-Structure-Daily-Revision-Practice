class StackUsingLinkedList
{
    private class SNode 
    {
        int data;
        SNode link;
    }
    SNode top;
    public void push(int d)
    {
        SNode temp = new SNode();
        if(top == null)
        {
            temp.data = d;
            temp.link = null;
            top = temp;
        }
        else
        {
            temp.data = d;
            temp.link = top;
            top = temp;
        }
    }
    public void pop()
    {
        if(top == null)
        {
            System.out.println("Stack Underflow");
        }
        top = (top).link;
    }
    public void display()
    {
        if(top == null)
        {
            System.out.println("Stack Underflow");
        }
        else
        {
            SNode temp = top;
            while(temp != null)
            {
                System.out.print(temp.data +" ");
                temp = temp.link;
            }
        }
    }
    public static void main()
    {
        StackUsingLinkedList s=new StackUsingLinkedList();
        s.push(10);
        s.push(20);
        s.pop();
        s.push(30);
        s.push(40);
        s.push(50);
        s.pop();
        s.display();
    }
}