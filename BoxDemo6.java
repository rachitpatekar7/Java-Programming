import java.util.*;
class Box
{
    double width;
    double height;
    double depth;
Box()
{
    System.out.println("Constructing Box");
    width = 0;
    height = 0;
    depth = 0;
}
double volume()
{
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Width : ");
    width = sc.nextDouble();
    System.out.print("Enter Height : ");
    height = sc.nextDouble();
    System.out.print("Enter Depth : ");
    depth = sc.nextDouble();
    return width*height*depth;
}
}
class BoxDemo6
{
    public static void main(String args[])
    {
    Box b1 = new Box();
    double v = b1.volume();
    System.out.println("Volume of box 1 = "+ v);
    Box b2 = new Box();
    v = b2.volume();
    System.out.println("Volume of box 2 = "+ v);
    }
}
