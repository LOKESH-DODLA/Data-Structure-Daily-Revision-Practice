class Num_Rec
{
    public static void display(int n)
    {
        if(n > 1)
        {
            display(n-1);
        }
        System.out.println(n);
    }
    public static void main(String args[])
    {
        Num_Rec nrc = new Num_Rec();
        nrc.display(5);
    }
}