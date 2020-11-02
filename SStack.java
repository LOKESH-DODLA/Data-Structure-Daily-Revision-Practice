class SStack
{
    int top;
    char ar[];
    int size;
    SStack(int s)
    {
        top = -1;
        size = s;
        ar = new char[s];
    }
    boolean isEmpty()
    {
        return (top < 0);
    }
    public boolean push(char n)
    {
        if(top >= size)
        {
            System.out.println("Stack Overflow ");
            return false;
        }
        else
        {
            ar[++top] = n;
            return true;
        }
    }
    public char pop()
    {
        if(top < 0)
        {
            System.out.println("Stack Underflow ");
            return 0;
        }
        else
        {
            char x = ar[top--];
            return x;
        }
    }
}
