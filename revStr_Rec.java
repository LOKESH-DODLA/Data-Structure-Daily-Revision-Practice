class revStr_Rec
{
    public static String rev(String s)
    {
        if(s.length() == 1)
        {
            return s;
        }
        else
        {
            return rev(s.substring(1) + s.charAt(0));
        }
    }
    public static void main(String args[])
    {
        revStr_Rec rs = new revStr_Rec();
        System.out.println(rs.rev("ANU"));
    }
}
        