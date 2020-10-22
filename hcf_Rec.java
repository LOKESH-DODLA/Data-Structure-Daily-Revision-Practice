class hcf_Rec
{
    public static int hcf(int a , int b)
    {
        if(a==0)
        {
            return b;
        }
        else
        {
            return hcf(b % a , a);
        }
    }
    public static void main(String args[])
    {
        hcf_Rec hr = new hcf_Rec();
        System.out.println(hr.hcf(10 , 15));
    }
}