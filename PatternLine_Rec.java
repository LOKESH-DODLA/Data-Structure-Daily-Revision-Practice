class PatternLine_Rec
{
    public static void pp(int n)
    {
        System.out.print("*");
        if(n > 1)
        {
            pp(n-1);
        }
        else
        {
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        PatternLine_Rec pr = new PatternLine_Rec();
        pr.pp(5);
    }
}