class Shape
{
int side1,side2;
double ar;
Shape()//Explicit Default Constructor
{
side1=7;
side2=9;
System.out.println("Class Shape is initialized");
}
void areaRect()//method
{
ar=side1*side2;
System.out.println("Area of Rectangle="+ar);
}
void areaTri()//method
{
ar=side1*side2/2;
System.out.println("Area of Triangle="+ar);
}
}
class Constructor2
{
public static void main(String args[])
{
Shape s=new Shape();
s.areaRect();
s.areaTri();
}
}