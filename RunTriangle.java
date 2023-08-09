class Triangle
{
int a,b,c;
double s,ar;
Triangle(int x,int y, int z)
{
a=x;
b=y;
c=z;
System.out.println("This is class triangle");
}
void area()
{
s=(a+b+c)/2.0;
ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
System.out.println("area of triangle="+a);
}
}
class RunTriangle
{
public static void main(String args[])
{
//Triangle T=new Triangle();Error
Triangle TR=new Triangle(8,5,6);
TR.area();
}
}