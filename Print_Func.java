import java.util.Scanner;
class Print_Func
{
    public static void printn(int n)
    {
        System.out.println("Integer "+n);
    }
    public static void printn(double n)
    {
        System.out.println("Double "+n);
    }
    public static void printn(float n)
    {
        System.out.println("Float "+n);
    }
    public static void printn(long n)
    {
        System.out.println("long "+n);
    }
    public static void main(String args[])
    {
        printn(2.34);
        printn(2230);
    }
}