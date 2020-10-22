class Fact_Rec
{
    public static int fact(int n)
    {
        if(n<=1)
        {
            return 1;
        }
        else
        {
            return n * fact(n-1);
        }
    }
    public static void main(String args[])
    {
        Fact_Rec fr = new Fact_Rec();
        System.out.println(fr.fact(5));
    }
}