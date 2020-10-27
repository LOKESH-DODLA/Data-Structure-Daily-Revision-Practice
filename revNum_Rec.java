class revNum_Rec
{
    public static void display(int n)
    {
        System.out.println(n);
        if(n>1)
        {
            display(n-1);
        }
    }
    public static void main(String args[])
    {
        revNum_Rec nr = new revNum_Rec();
        nr.display(5);
    }
}