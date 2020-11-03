class RevStr_Stack
{
    public static void reverse(StringBuffer s)
    {
        int l = s.length();
        SStack ob = new SStack(l);
        int i;
        for(i=0;i<l;i++)
        {
            ob.push(s.charAt(i));
        }
        for(i=0; i<l; i++)
        {
            char ch = ob.pop();
            s.setCharAt(i,ch);
        }
    }
    public static void main(String args[])
    {
        StringBuffer s = new StringBuffer("Anushka");
        reverse(s);
        System.out.println("Reverse String : "+s);
    }
}