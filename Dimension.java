/*
Wap to creat a class Dimension that contain 3 attributes w, h,d and compute area of Shape if Formula is given below 
Area=2(wh+hd+dw)
(Implement Default, Paramerized call By value and paramterized Constructor call By reference)
*/
class Dimension
{
int w,h,d,ar;
Dimension()
{
w=6;
h=8;
d=9;
}
Dimension(int x,int y,int z)
{
w=x;
h=y;
d=z;
}
Dimension(Dimension D)
{
w=D.w;
h=D.h;
d=D.d;
}
void area()
{
ar=2*(w*h+h*d+d*w);
System.out.println("Area of Shape="+ar);
}
public static void main(String args[])
{
Dimension D1= new Dimension(7,9,8);
Dimension D2= new Dimension(D1);
Dimension D3= new Dimension();
D1.area();
D2.area();
D3.area();
}
}