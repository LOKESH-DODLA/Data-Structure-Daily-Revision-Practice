class sumDig_Rec
{
    public static int sumDigits(int n)
    {
        if(n/10 == 0)
        {
            return n;
        }
        else
        {
            return n%10+sumDigits(n/10);
        }
    }
    public static void main(String args[])
    {
        sumDig_Rec sdr = new sumDig_Rec();
        System.out.println(sdr.sumDigits(153));
    }
}