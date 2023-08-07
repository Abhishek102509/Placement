import java.util.Scanner;
class Circle
{
double r,ar,cr;
Circle()
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter the Radius of Circle");
r=scan.nextDouble();
}
void area()
{
ar=Math.PI*r*r;
System.out.println("Area of Circle="+ar);
}
void circum()
{
cr=2*Math.PI*r;
System.out.println("Circumference="+cr);
}
}
class RunCircle2
{
public static void main(String args[])
{
Circle ob=new Circle();
ob.area();
ob.circum();
}
}