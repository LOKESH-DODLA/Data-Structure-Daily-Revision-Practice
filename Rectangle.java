import java.util.Scanner;
class Rectangle
{
    int length;
    int breadth;
    public Rectangle(int l , int b)
    {
        length = l;
        breadth = b;
    }
    public int getArea()
    {
        return length * breadth;
    }
    public int getPerimeter()
    {
        return 2*(length + breadth);
    }
    public static void main(String args[])
    {
        Rectangle r1 = new Rectangle(4,5);
        Rectangle r2 = new Rectangle(8,7);
        System.out.println("Area = "+r1.getArea()+" Perimeter = "+r1.getPerimeter());
        System.out.println("Area = "+r2.getArea()+" Perimeter = "+r2.getPerimeter());
    }
}
