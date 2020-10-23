class sumOdd_Rec
{
    public static int sumodd(int n)
    {
        if(n!=0)
        {
            if(n%2 != 0)
            {
                return n%10+sumodd(n/10);
            }
            else
            {
                return sumodd(n/10);
            }
        }
        else
        {
            return 0;
        }
    }
    public static void main(String args[])
    {
        sumOdd_Rec sr = new sumOdd_Rec();
        System.out.println(sr.sumodd(141));
    }
}
