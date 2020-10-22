class Bin_Rec
{
    public static void toBinary(int d)
    {
        if(d>=2)
        {
            toBinary(d/2);
        }
        System.out.print(d%2);
    }
    public static void main(String args[])
    {
        Bin_Rec nr = new Bin_Rec();
        nr.toBinary(5);
    }
}